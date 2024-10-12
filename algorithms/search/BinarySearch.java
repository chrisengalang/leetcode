package algorithms.search;

public class BinarySearch {

  /**
   * Binary search - Sorting algo that takes the half of the input array for each iteration. Only works for sorted arrays.
   *
   * Time complexity: O(log(n)) The window of the array being search gets smaller by half for each iteration.
   * Space complexity: O(1) No additional space is needed to do the search.
   *
   * @param numbers
   * @return
   */
  public static int binarySearch(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left <= right) {
      int half = left + (right - left) / 2;

      if (target < numbers[half]) {
        right = half - 1;
      } else if (target > numbers[half]) {
        left = half + 1;
      } else {
        return half;
      }
    }

    return -1;
  }

  /**
   * Recursive form of binary search.
   *
   * Time complexity: O(log n) The window of the search is divided in half with each recursive call. Same as iterative.
   * Space complexity: O(log n) A call is added the call stack with each layer of recursive call.
   *
   * @param numbers
   * @param target
   * @return
   */
  public static int recursiveBinarySearch(int[] numbers, int target) {
    return recursiveBinarySearch(numbers, target, 0, numbers.length - 1);
  }

  /**
   * Helper function for the recursive binary search. Add the parameters of the start and end of the search window.
   *
   * @param numbers
   * @param target
   * @param left
   * @param right
   * @return
   */
  private static int recursiveBinarySearch(int[] numbers, int target, int left, int right) {
    if (left > right) {
      return -1;
    }

    int half = left + (right - left) / 2;

    if (target == numbers[half]) {
      return half;
    }

    if (target < numbers[half]) {
      return recursiveBinarySearch(numbers, target, left, half - 1);
    } else {
      return recursiveBinarySearch(numbers, target, half + 1, right);
    }
  }

  public static void main(String[] args) {
    int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

    System.out.println("The number is at index: " + binarySearch(numbers, 0));
    System.out.println("The number is at index: " + recursiveBinarySearch(numbers, 0));
  }
}
