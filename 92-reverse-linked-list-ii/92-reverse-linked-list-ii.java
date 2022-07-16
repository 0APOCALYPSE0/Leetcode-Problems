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
    public ListNode reverse(ListNode node, ListNode prevNode){
        ListNode prev = prevNode;
        ListNode next = null;
        
        while(node != prevNode){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right || head == null){
            return head;
        }
        ListNode currentNode = head;
        ListNode left1 = null;
        ListNode left2 = null;
        ListNode right1 = null;
        ListNode right2 = null;
        boolean leftFlag = true;
        boolean rightFlag = true;
        int count = 1;
        while(currentNode != null){
            if(leftFlag && count == left){
                left2 = currentNode;
                leftFlag = false;
            }
            if(leftFlag){
                left1 = currentNode;
            }
            if(rightFlag && count == right){
                right2 = currentNode;
                rightFlag = false;
            }
            if(rightFlag){
                right1 = currentNode;
            }
            if(leftFlag == false && rightFlag == false){
                break;
            }
            count++;
            currentNode = currentNode.next;
        }
        // System.out.println(left1.val+" "+left2.val+" "+right1.val+" "+right2.val);
        ListNode rev = this.reverse(left2, right2.next);
        if(left1 != null){
            left1.next = rev;   
        }else{
            head = rev;
        }
        return head;
    }
}