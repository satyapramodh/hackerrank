/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission.
// You only need to complete this method.

  Node current, tail;
  current = head;

  tail = new Node();
  tail.data = data;

  if(head == null){
    return tail;
  }

  while(current.next != null){
    current = current.next;
  }

  current.next = tail;

  return head;
}
