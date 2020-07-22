// Binary Tree Zigzag Level Order Traversal

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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root != null){
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.add(root);
            boolean reverseFlag = false;
            while(!s1.empty() || !s2.empty()){
                ArrayList<Integer> internalList = new ArrayList<>();
                while(!s1.empty()){
                    TreeNode node = s1.pop();
                    internalList.add(node.val);
                    if(node.left != null){
                        s2.push(node.left);
                    }
                    if(node.right != null){
                        s2.push(node.right);
                    }
                }
                if(internalList.size()>0)
                    result.add(internalList);
                internalList = new ArrayList<>();
                while(!s2.empty()){
                    TreeNode node = s2.pop();
                    internalList.add(node.val);
                    if(node.right != null){
                        s1.push(node.right);
                    }
                    if(node.left != null){
                        s1.push(node.left);
                    }                    
                }
                if(internalList.size()>0)
                    result.add(internalList);
            }
        }
        return result;
    }
}