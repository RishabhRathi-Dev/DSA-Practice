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
    public int minDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        int lvl = 1;

        while(!q.isEmpty()){

            int level_size = q.size();

            for(int i = 0; i < level_size; i++){
                TreeNode curr = q.poll();
                
                if (curr.left == null && curr.right == null){
                    return lvl;
                } else{
                
                    if (curr.left != null){
                        q.add(curr.left);
                       
                    }

                    if (curr.right != null){
                        q.add(curr.right);
                       
                    }
                }
            }

            lvl++;
        }

        return lvl;
    }
}