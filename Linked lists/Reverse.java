/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
  Node next, prev;

  while(head != null){
    prev = head.prev;
    next = head.next;
    head.next = prev;
    head.prev = next;
    if(head.prev != null){
      head = head.prev;
    } else {
      break;
    }
  }

  return head;
}
