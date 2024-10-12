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

    while (left < right) {
      int half = right / 2;

      if (target < numbers[half]) {
        right = half;
      } else if (target > numbers[half]) {
        left = half;
      } else {
        return half;
      }
    }

    return -1;
  }


  public static void main(String[] args) {
    int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println("The number is at index: " + binarySearch(numbers, 3));
  }
}
