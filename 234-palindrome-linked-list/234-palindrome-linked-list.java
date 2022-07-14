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
    public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode next = null;
        
        while(node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }else if(head.next.next == null){
            if(head.val == head.next.val){
                return true;
            }else{
                return false;
            }
        }
        
        ListNode slow = head;
	    ListNode fast = head;
	    
        int count = 1;
	    ListNode mid = null;
	    while(slow != null && fast != null && fast.next != null){
            if(fast.next != null){
                count++;
            }
            if(fast.next != null && fast.next.next != null){
                count++;
            }
	        mid = slow;
	        slow = slow.next;
	        fast = fast.next.next;
	    }
        // System.out.println(count);
        if(count % 2 != 0){
            mid = mid.next;
        }
	    ListNode rev = this.reverse(mid.next);
	    mid.next = rev;
        boolean flag = true;
        // System.out.println(rev.val);
        while(rev != null){
            System.out.println(head.val + " " + rev.val);
            if(head.val != rev.val){
                flag = false;
                break;
            }
            rev = rev.next;
            head = head.next;
        }
        // while(head != null){
        //     System.out.print(head.val+" ");
        //     head = head.next;
        // }
        // System.out.println();
        return flag;
    }
}