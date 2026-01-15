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
    public ListNode reverseList(ListNode temp){
        ListNode prev = null;
        while(temp!=null){
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }

    public ListNode findKthNode(ListNode temp, int k){
        while(temp!=null && k>1){
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1){
            return head;
        }

        ListNode temp = head;
        ListNode prevLast = null;

        while(temp != null){
            ListNode kthNode = findKthNode(temp,k);

            if(kthNode == null){
                prevLast.next = temp;
                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            reverseList(temp);

            if(temp == head){
                head = kthNode;
            }
            else{
                prevLast.next = kthNode;
            }

            prevLast = temp;
            temp = nextNode;

        }
        
        return head;
    }
}