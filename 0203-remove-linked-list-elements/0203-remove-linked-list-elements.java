/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }else if(val == 0){
            return head;
        }
        ListNode current = null;
        ListNode newNode = null;
        while(head != null){
            if(head.val != val){
                ListNode temp = new ListNode(head.val);
                if(current == null){
                    System.out.println(head.val);
                    newNode = temp;
                    current = temp;
                }else{
                    current.next = temp;
                    current = current.next;   
                }
            }
            head = head.next;
        }
        return newNode;
    }
}