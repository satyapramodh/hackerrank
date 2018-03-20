/*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission.
     // You only need to complete this method
  // if one of them is empty
  if(headA == null){
    return headB;
  }
  if(headB == null){
    return headA;
  }

  Node tempHead = new Node();

  if(headA.data > headB.data){
    tempHead.data = headB.data;
    tempHead.next = mergeLists(headA, headB.next);
  } else {
    tempHead.data = headA.data;
    tempHead.next = mergeLists(headA.next, headB);
  }

  return tempHead;
}
