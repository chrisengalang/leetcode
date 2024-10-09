package _1700;

import java.util.ArrayDeque;

/**
 * LeetCode URL: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/
 */
public class Main {

  /**
   * Time complexity: O(n) - Iterate through the students array to add to the queue,
   *                         and another iteration for performing the sandwich-getting logic.
   * Space complexity: O(n) - Create a queue of n size from the integers of the students array.
   *
   * @param students
   * @param sandwiches
   * @return
   */
  public static int countStudents(int[] students, int[] sandwiches) {
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    for (int student : students) {
      deque.add(student);
    }

    int count = 0;

    for (int i = 0; deque.size() > 0 && count != deque.size(); ) {
      if (sandwiches[i] == deque.peek()) {
        deque.poll();
        i++;
        count = 0;
      } else {
        deque.add(deque.poll());
        count++;
      }
    }

    return deque.size();
  }

  public static void main(String[] args) {
    System.out.println(countStudents(new int[] {1, 1, 0, 0}, new int[] {0, 1, 0, 1}));
    System.out.println(countStudents(new int[] {1, 1, 1, 0, 0, 1}, new int[] {1, 0, 0, 0, 1, 1}));
  }

}


