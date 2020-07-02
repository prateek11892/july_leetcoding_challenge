// Binary Tree Level Order Traversal II

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
    List<List<Integer>> result  = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root != null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            Stack<ArrayList<Integer>> stack = new Stack<>();
            while(queue.size() != 0){
                int count = queue.size();
                ArrayList<Integer> internalList = new ArrayList<>();
                for(int i = 0 ; i < count; i++){
                    TreeNode node = queue.poll();
                    internalList.add(node.val);
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                }
                stack.push(internalList);
            }
            while(!stack.empty()){
                result.add(stack.pop());
            }
        }
        return result;
    }
}
