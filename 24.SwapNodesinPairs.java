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
    public ListNode findKthNode(ListNode temp, int k){
        while(temp != null && k > 1){
            temp = temp.next;
            k--;
        }

        return temp;
    }

    public ListNode reversePair(ListNode temp){
        ListNode prev = null;
        while(temp != null){
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }

        return prev;
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head; 
        ListNode temp = head;
        ListNode prevLast = dummy;

        while(temp != null){
            ListNode kthNode = findKthNode(temp, 2);

            if(kthNode == null){
                prevLast.next = temp;
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            ListNode reversedHead = reversePair(temp);
            prevLast.next = reversedHead;
            
            prevLast = temp;
            temp = nextNode;
        }
        
        return dummy.next;
    }
}