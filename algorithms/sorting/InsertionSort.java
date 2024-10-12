package algorithms.sorting;

public class InsertionSort {

  /**
   * Time complexity: O(n^2) In the worst case scenario where the smaller numbers are near the end of the array,
   *                         it would have to loop through almost the entire array to find the correct index of each
   *                         number.
   * Space complexity: O(1) No additional space was allocated for sorting the array.
   *
   * @param numbers
   * @return
   */
  public static int[] insertionSort(int[] numbers) {
    for (int i = 1; i < numbers.length; i++) {
      int j = i - 1;

      while (j >= 0 && numbers[j + 1] < numbers[j]) {
        int temp = numbers[j];
        numbers[j] = numbers[j+1];
        numbers[j+1] = temp;

        j--;
      }
    }

    return numbers;
  }

  public static void main(String[] args) {
    for (int number : insertionSort(new int[] {7,1,4,2,8,5,6})) {
      System.out.print(number);
    }
  }
}
