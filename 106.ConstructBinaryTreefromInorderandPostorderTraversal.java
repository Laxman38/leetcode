/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int postLength;
    Map <Integer, Integer> inOrderMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postLength = postorder.length - 1;
        inOrderMap = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            inOrderMap.put(inorder[i], i);
        }

        return helper(postorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] postorder, int inStart, int inEnd){
        if(inStart > inEnd) return null;

        int rootVal = postorder[postLength--];
        TreeNode root = new TreeNode(rootVal);

        int inIndex = inOrderMap.get(rootVal);

        root.right = helper(postorder, inIndex + 1, inEnd);
        root.left = helper(postorder, inStart, inIndex - 1);

        return root;
    }
}

