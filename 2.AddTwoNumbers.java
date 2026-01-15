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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;

        while(temp1!=null || temp2!=null){
            int sum = 0;

            if(temp1!=null){
                sum += temp1.val;
                temp1=temp1.next;
            }

            if(temp2!=null){
                sum += temp2.val;
                temp2=temp2.next;
            } 
            
            sum+=carry;

            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;

            current.next = newNode;
            current = current.next;
        }
        if(carry!=0){
            ListNode carryNode = new ListNode(carry);
            current.next = carryNode;
        }
        return dummy.next;
    }
}