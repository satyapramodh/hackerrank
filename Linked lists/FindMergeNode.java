/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {

  Node currentA, currentB;
  currentA = headA;
  currentB = headB;

  while(currentA != null || currentB != null){
    if(currentA != null && currentB !=null && currentA.data == currentB.data){
      return currentA.data;
    }

    // switch when they become null otherwise keep going forward
    if(currentA != null) {
      currentA = currentA.next;
    } else {
      currentA = headB;
    }
    if(currentB != null) {
      currentB = currentB.next;
    } else {
      currentB = headA;
    }
  }
  return 0;
}
