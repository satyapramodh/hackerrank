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

Node SortedInsert(Node head,int data) {
  Node temp = new Node();
  temp.data = data;

  if(head == null){
    return temp;
  }

  Node current = head;

  while(current != null && current.next != null){
    if(data >= current.data && data <= current.next.data){
      temp.next = current.next;
      current.next = temp;
      return head;
    }
    current = current.next;
  }

  current.next = temp;
  return head;
}
