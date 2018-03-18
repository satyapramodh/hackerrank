/*
  Insert Node at the beginning of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission.
// You only need to complete this method.

Node Insert(Node head,int x) {
    Node new_head = new Node();
  new_head.data = x;
   new_head.next = head;
  return new_head;
}
