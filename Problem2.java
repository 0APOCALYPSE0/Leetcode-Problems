/*
  2. Add Two Numbers

  You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
  You may assume the two numbers do not contain any leading zero, except the number 0 itself.

  Example:1
            Input: l1 = [2,4,3], l2 = [5,6,4]
            Output: [7,0,8]
            Explanation: 342 + 465 = 807.

  Example:2
            Input: l1 = [0], l2 = [0]
            Output: [0]

  Example:3
            Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
            Output: [8,9,9,9,0,0,0,1]
*/

/* Definition for singly-linked list. */
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Problem2 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode resultNode = new ListNode(0);
    ListNode a = l1, b = l2, currentNode = resultNode;
    int carry = 0;
    while(a != null || b != null){
      int x = (a != null) ? a.val : 0;
      int y = (b != null) ? b.val : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      currentNode.next = new ListNode();
      currentNode = currentNode.next;
      currentNode.val = sum % 10;
      if (a != null) a = a.next;
      if (b != null) b = b.next;
    }
    if(carry > 0){
        currentNode.next = new ListNode(carry);
    }
    return resultNode.next;
  }
  public static void main(String args[]){

  }
}
