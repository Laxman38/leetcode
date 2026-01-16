/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public void createCopyList(Node head){
        Node temp = head;
        while(temp!=null){
            Node copyNode = new Node(temp.val);
            Node nextNode = temp.next;
            temp.next = copyNode;
            copyNode.next  = nextNode;
            temp = temp.next.next;
        }
    }

    public void randomPointer(Node head){
        Node temp = head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random = temp.random.next;   
            }
            temp = temp.next.next;
        }
    }

    public Node deepCopy(Node head){
        Node temp = head;
        Node dummy = new Node(-1);
        Node res = dummy;
        while(temp!=null){
            Node copy = temp.next;
            res.next = copy;
            res = copy;
            temp.next = copy.next;
            temp = temp.next;
        }
        return dummy.next;
    }

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        createCopyList(head);
        randomPointer(head);
        return deepCopy(head);
    }
}