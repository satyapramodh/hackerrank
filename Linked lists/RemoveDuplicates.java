/*
Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission.
  // You only need to complete this method.
  if(head == null) return null;

  Node current = head;

  while(current != null && current.next != null){
    while(current.next!= null && current.data == current.next.data){
      // repeat
      current.next = current.next.next;
    }

    if(current.next!= null && current.data != current.next.data){
      current = current.next;
    }
  }

  return head;
}
