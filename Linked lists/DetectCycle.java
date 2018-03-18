/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
  if(head == null) return false;

  Node slow, fast = null;
  slow = head;
  if(head.next != null){
    fast = head.next;
  }

  while(true){
    if(fast == null || slow == null) return false;

    if(fast == slow) return true;

    if(fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    } else {
      return false;
    }
  }
}
