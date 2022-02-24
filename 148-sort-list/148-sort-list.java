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
    
    ListNode paritionLast(ListNode start, ListNode end)
    {
        if (start == end || start == null || end == null)
            return start;
 
        ListNode pivot_prev = start;
        ListNode curr = start;
        int pivot = end.val;
 
        while (start != end) {
            if (start.val < pivot) {
                pivot_prev = curr;
                int temp = curr.val;
                curr.val = start.val;
                start.val = temp;
                curr = curr.next;
            }
            start = start.next;
        }
 
        int temp = curr.val;
        curr.val = pivot;
        end.val = temp;
 
        return pivot_prev;
    }
    
    void sort(ListNode start, ListNode end)
    {
        if(start == null || start == end|| start == end.next )
            return;
 
        ListNode pivot_prev = paritionLast(start, end);
        sort(start, pivot_prev);
 
        if (pivot_prev != null && pivot_prev == start)
            sort(pivot_prev.next, end);
 
        else if (pivot_prev != null
                 && pivot_prev.next != null)
            sort(pivot_prev.next.next, end);
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode end = head;
        while (end.next != null)
            end = end.next;
        
        sort(head, end);
        return head;
    }
}