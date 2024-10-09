package neetcode.recursion.factorial;

public class Main {

  /**
   * Time complexity: O(n) The time complexity depends on n variable.
   * Space complexity: O(n) Because the function is recursive, it takes up extra space in the call stack.
   *
   * @param n
   * @return
   */
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }

    return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
}
