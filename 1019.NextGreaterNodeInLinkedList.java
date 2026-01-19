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
    public int[] nextLargerNodes(ListNode head) {
        Stack <Integer> st = new Stack<>();
        List <Integer> al = new ArrayList<>();
        
        ListNode current = head;
        int count = 0;

        while(current != null){
            current = current.next;
            count++;
        }

        int []answer = new int[count];

        current = head;
        while(current != null){
            al.add(current.val);
            current = current.next;
        }

        for(int i = al.size() - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= al.get(i)){
                st.pop();
            }

            answer[i] = (st.isEmpty()) ? 0 : st.peek();
            st.push(al.get(i));
        }
         return answer;
    }
}