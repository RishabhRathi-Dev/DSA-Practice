/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){
        if (root == p || root == null || root == q){
            return root;
        }

        TreeNode leftResult = dfs(root.left, p, q);
        TreeNode rightResult = dfs(root.right, p, q);

        if (leftResult == null && rightResult == null){
            return null;
        }

        if (leftResult != null && rightResult != null){
            return root;
        }

        return leftResult == null ? rightResult : leftResult;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = dfs(root, p, q);
        return res;
    }
}