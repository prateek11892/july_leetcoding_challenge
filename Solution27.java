// Construct Binary Tree from Inorder and Postorder Traversal

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder, postorder, 0, inorder.length - 1, postorder.length - 1);
    }
    
    public TreeNode buildTreeHelper(int[] inorder, int[] postorder, int inorderStart, int inorderEnd, int postEnd){
        
        if(inorderStart > inorderEnd || postEnd < 0){
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[postEnd]);
        int i;
        for(i = inorderStart; i < inorderEnd; i++){
            if(inorder[i] == root.val){
                break;
            }
        }
        
        root.left = buildTreeHelper(inorder, postorder, inorderStart, i-1, postEnd-1+i-inorderEnd);
        root.right = buildTreeHelper(inorder, postorder, i+1, inorderEnd, postEnd-1);
        
        return root;
    }
        
}