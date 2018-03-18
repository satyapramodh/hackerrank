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
  Node currentA, currentB;
  currentA = headA;
  currentB = headB;
  if(currentA == null){
    return headB;
  }
  if(currentB == null){
    return headA;
  }

  // while(currentA != null || currentB != null){
  //   if(currentA.data > currentB.data){
  //     Node temp = new Node();
  //     temp.data = currentB.data;
  //   }
  // }

  return headA;
}
