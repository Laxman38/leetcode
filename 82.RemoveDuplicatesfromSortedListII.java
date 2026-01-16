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
    public ListNode deleteDuplicates(ListNode head) {
         if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while(temp!=null){
            if(temp.next!=null && temp.val == temp.next.val){
                int dupVal = temp.val;

                while(temp!=null && temp.val == dupVal){
                    temp = temp.next;
                }
                prev.next = temp;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        
        return dummy.next;
    }
}