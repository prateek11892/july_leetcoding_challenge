// Maximum Width of Binary Tree

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
class Pair{
    TreeNode node;
    int hd;
    Pair(TreeNode node, int hd){
        this.node = node;
        this.hd = hd;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        
        int maxWidth = Integer.MIN_VALUE;
        while(queue.size() != 0){
            int leftmost=0, rightmost=0;
            int count = queue.size();
            for(int i = 0; i < count; i++){
                Pair pair = queue.poll();
                TreeNode temp = pair.node;
                int dist = pair.hd;
                if(i == 0){
                    leftmost = dist;
                }
                if(i == count-1){
                    rightmost = dist;
                }
                if(temp.left != null){
                    queue.add(new Pair(temp.left, dist*2 -1));
                }
                if(temp.right != null){
                    queue.add(new Pair(temp.right, dist*2));
                }
            }
            if(maxWidth < (rightmost-leftmost +1))
                maxWidth = rightmost - leftmost+1;
        }
        return maxWidth;
    }
}