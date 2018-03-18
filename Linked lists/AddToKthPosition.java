/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/


Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission.
    // You only need to complete this method.
  Node newest = new Node();
  newest.data = data;

  if(position == 0){
    newest.next = head;
    return newest;
  } else {
    int count = 1;
    Node current = head;
    while(count != position){
      current = current.next;
      count++;
    }
    newest.next = current.next;
    current.next = newest;
  }

  return head;
}
