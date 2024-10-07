package neetcode.queue.deque;

public class Main {
  public static void main(String[] args) {
    Deque deque = new Deque();
  }
}

class Deque {
  Node dummyHead;
  Node dummyTail;

  public Deque() {
    this.dummyHead = new Node(0);
    this.dummyTail = this.dummyHead;
  }

  /**
   * Check if the deque is empty.
   *
   * @return
   */
  public boolean isEmpty() {
    return this.dummyHead.next == null && this.dummyTail.previous == null;
  }

  /**
   * Add a value at the end of the queue.
   *
   * @param value
   */
  public void append(int value) {
    Node node = new Node(value);
    Node previous = this.dummyTail.previous;

    node.previous = previous;
    node.next = this.dummyTail;

    previous.next = node;
    this.dummyTail.previous = node;
  }

  public void appendLeft(int value) {
    Node node = new Node(value);

    node.next = this.dummyHead.next;
    node.previous = this.dummyHead;

    this.dummyHead.next.previous = node;
    this.dummyHead.next = node;
  }

  public int pop() {
    if (isEmpty()) return -1;

    Node returnNode = this.dummyTail.previous;
    Node newTail = returnNode.previous;

    int value = returnNode.value;

    this.dummyTail.previous = newTail;
    newTail.next = this.dummyTail;

    return value;
  }

  public int popLeft() {
    if (isEmpty()) return -1;

    Node returnNode = this.dummyHead.next;
    Node newHead = returnNode.next;

    int value = returnNode.value;

    this.dummyHead.next = newHead;
    newHead.previous = this.dummyHead;

    return value;
  }

}

class Node {
  int value;
  Node previous;
  Node next;

  Node(int value) {
    this.value = value;
    this.previous = null;
    this.next = null;
  }
}


//  Design a Double-ended Queue class.
//
//    Your Deque class should support the following operations:
//
//    Deque() will initialize an empty queue.
//    bool isEmpty() will return whether the queue is empty or not.
//    void append(int value) will insert value at the end of the queue.
//    void appendleft(int val) will insert value at the beginning of the queue.
//    int pop() will remove and return the value at the end of the queue. If the queue is empty, return -1.
//    int popleft() will remove and return the value at the beginning of the queue. If the queue is empty, return -1.
//    Note: You should implement each operation in
//    O
//    (
//    1
//    )
//    O(1) time complexity.
//
