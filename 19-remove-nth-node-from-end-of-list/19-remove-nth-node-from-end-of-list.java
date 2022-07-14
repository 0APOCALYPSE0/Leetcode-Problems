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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        int length = 1;
        while(currentNode != null && currentNode.next != null){
            length++;
            currentNode = currentNode.next;
        }
        if(length == 1){
            return null;
        }
        currentNode = head;
        int count = length - n;
        while(count > 1){
            currentNode = currentNode.next;
            count--;
        }
        if(count == 0){
            head = currentNode.next;
            currentNode.next = null;
        }else{
            currentNode.next = currentNode.next.next;   
        }
        return head;
    } 
}