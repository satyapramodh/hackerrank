/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission.
    // You only need to complete this method.
Node Reverse(Node head) {
  Stack reversed = new Stack();
  Node current = null, reverseHead = null;

  while(head != null){
    reversed.push(head.data);
    head = head.next;
  }

  while(reversed.size() != 0){
    if(reverseHead == null){
      reverseHead = new Node();
      reverseHead.data = (int) reversed.pop();
      current = reverseHead;
    } else {
      current.next = new Node();
      current.next.data = (int) reversed.pop();
      current = current.next;
    }
  }
  return reverseHead;
}
