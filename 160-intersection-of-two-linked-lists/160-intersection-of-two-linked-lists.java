/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode currentNodeA = headA;
        ListNode currentNodeB = headB;
        
        while(currentNodeA != null || currentNodeB != null){
            if(currentNodeA != null){
                lengthA++;
                currentNodeA = currentNodeA.next;
            }
            if(currentNodeB != null){
                lengthB++;
                currentNodeB = currentNodeB.next;
            }
        }
        int difference = Math.abs(lengthA - lengthB);
        boolean listA = false;
        boolean listB = false;
        if(lengthA == lengthB){
            listA = true;
            listB = true;
        }else if(lengthA > lengthB){
            listA = true;
        }else{
            listB = true;
        }
        // System.out.println(lengthA+" "+lengthB);
        boolean isFound = false;
        while(headA != null || headB != null){
            if(headA == headB){
                isFound = true;
                break;
            }
            if(headA != null && listA){
                headA = headA.next;
                difference--;
                if(difference == -1 && listB == false){
                    listB = true;
                }
            }
            if(headB != null && listB){
                headB = headB.next;
                difference--;
                if(difference == 0 && listA == false){
                    listA = true;
                }
            }
        }
        return isFound ? headA : null;
    }
}