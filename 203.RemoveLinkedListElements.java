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
        }

        ListNode current = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevLast = dummy;

        while(current!=null){
            if(current.val == val){
                prevLast.next = current.next;
            }
            else{
                prevLast = current;
            }
            current = current.next;
        }
        
        return dummy.next;
    }
}