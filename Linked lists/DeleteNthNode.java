/*
  Delete Node at a given position in a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission.
    // You only need to complete this method.

Node Delete(Node head, int position) {
  // head case
  if(position == 0){
    head = head.next;
    return head;
  }

  Node current = head;
  int count = 0;

  while(count+1 != position){
   current = current.next;
    count++;
  }
  // normal case
  if(current.next != null && current.next.next != null){
    current = current.next;
    current.data = current.next.data;
    current.next = current.next.next;
  } else {
    // tail case
    current.next = null;
  }

  return head;
}
