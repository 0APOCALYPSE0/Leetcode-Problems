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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        ListNode endNode = head;
        ListNode node = head;
        int length = 1;
        while(endNode != null && endNode.next != null){
            length++;
            endNode = endNode.next;
        }
        int rotateCount = (k < length) ? k : k%length;
        if(rotateCount == 0){
            return head;
        }
        for(int i=1; i<length-rotateCount; i++){
               node = node.next;
        }
        endNode.next = head;
        head = node.next;
        node.next = null;
        return head;
    }
}