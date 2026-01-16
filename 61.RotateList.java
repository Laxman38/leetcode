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
    public ListNode findNthNode(ListNode current, int k){
        int count = 1;
        while(current!=null){
            if(count == k) return current;
            count++;
            current = current.next;
        }
        return current;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        int count=1;
        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
            count++;
        }

        if(k % count == 0) return head;
        k = k % count;

        tail.next = head;
        ListNode NthNode = findNthNode(head,count-k);
        head = NthNode.next;
        NthNode.next = null;

        return head;
    }
}