/*
  21. Merge Two Sorted Lists

  Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

  Example:1
            Input: l1 = [1,2,4], l2 = [1,3,4]
            Output: [1,1,2,3,4,4]

  Example:2
            Input: l1 = [], l2 = []
            Output: []

  Example:3
            Input: l1 = [], l2 = [0]
            Output: [0]

*/

/* Definition for singly-linked list. */
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Problem21 {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode resultNode = new ListNode(0);
    ListNode a = l1, b = l2, currentNode = resultNode;
    ListNode prev = null;

    while(a != null){
        int x = (a != null) ? a.val : 0;

        while(b != null){
            int y = (b != null) ? b.val : 0;
            if(b != null){
                // System.out.print("current"+b.val+" ");
            }
            if(prev != null){
                // System.out.print("prev"+prev.val+" ");
            }
            if(x < y){
                // System.out.println(x+ " " +y);
                // System.out.println(prev.val+ " "+ b.val);
                currentNode = new ListNode(x);
                // System.out.println(currentNode.val);
                currentNode.next = b;
                if(prev != null){
                    prev.next = currentNode;
                }else{
                    l2 = currentNode;
                }
                prev = currentNode;
                // System.out.println(l2.val+ " "+ l2.next.val+" hi");
                break;
            }
            prev = b;
            if (b != null) b = b.next;
            if(b == null){
                // System.out.println(x+ " prev "+ prev.val);
                // currentNode = new ListNode(x);
                // prev.next = currentNode;
                prev.next = a;
                // System.out.println(b.val);
                // System.out.println(l2.val+" "+l2.next.val+" "+l2.next.next.val+" "+
                //                   l2.next.next.next.val+" "+l2.next.next.next.next.val
                //                    +" "+l2.next.next.next.next.next.val);
                break;
            }
        }
        // System.out.println(b.val);
        if (a != null) a = a.next;
    }

    if(l2 == null){
        return l1;
    }
    return l2;
  }
  public static void main(String args[]){

  }
}
