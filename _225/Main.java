package _225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode URL: https://leetcode.com/problems/implement-stack-using-queues/
 */

class MyStack {

  Queue<Integer> stack;

  public MyStack() {
    stack = new LinkedList<>();
  }

  /**
   * Time complexity: O(n) - Loop through the queue object to reverse the order.
   * Space complexity: O(n) - Allocate space depending on the number of elements in the queue object.
   *
   * @param x
   */
  public void push(int x) {
    stack.add(x);
    for (int i = 0; i < stack.size() - 1; i++) {
      stack.add(stack.poll());
    }
  }

  /**
   * Time complexity: O(1)
   * Space complexity: O(1)
   *
   * @return
   */
  public int pop() {
    return stack.poll();
  }

  /**
   * Time complexity: O(1)
   * Space complexity: O(1)
   *
   * @return
   */
  public int top() {
    return stack.peek();
  }

  /**
   * Time complexity: O(1)
   * Space complexity: O(1)
   *
   * @return
   */
  public boolean empty() {
    return stack.isEmpty();
  }

}

public class Main {

  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push(1);
    stack.push(2);
    System.out.println(stack.top());
    System.out.println(stack.pop());
    System.out.println(stack.empty());
  }

}
