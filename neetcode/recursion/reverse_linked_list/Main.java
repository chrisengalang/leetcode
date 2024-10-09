package neetcode.recursion.reverse_linked_list;


/**
 * Singly Linked List.
 */
class Node {
  int value;
  Node next;

  Node(int value) {
    this.value = value;
    this.next = null;
  }
}

public class Main {

  /**
   * Use iterative method to reverse a singly linked list.
   *
   * Time complexity: O(n)
   * Space complexity: O(1)
   *
   * @param head
   * @return
   */
  public static Node reverseListIterative(Node head) {
    Node current = head;
    Node previous = null;

    while (current != null) {
      Node next = current.next;
      current.next = previous;

      previous = current;
      current = next;
    }

    return previous;
  }

  /**
   * Use recursive method to reverse a singly linked list.
   *
   * Time complexity: O(n)
   * Space complexity: O(n) - Because of function call stack.
   *
   * @param head
   * @return
   */
  public static Node reverseListRecursive(Node head) {
    return reverseList(head, null);
  }

  public static Node reverseList(Node current, Node previous) {
    if (current == null) {
      return previous;
    }

    Node next = current.next;
    current.next = previous;

    return reverseList(next, current);
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);

    Node current = head;
    while (current != null) {
      System.out.print(current.value);
      current = current.next;
    }
    System.out.println();
    Node newHead = reverseListRecursive(head);
    current = newHead;
    while (current != null) {
      System.out.print(current.value);
      current = current.next;
    }
  }
}