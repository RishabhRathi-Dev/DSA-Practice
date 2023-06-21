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
    public int rec(TreeNode root, int low, int high){
        if (root == null){
            return 0;
        }

        if (root.val >= low && root.val <= high){
            if (root.val == low){
                return root.val + rec(root.right, low, high);
            }

            else if (root.val == high){
                return root.val + rec(root.left, low, high);
            }

            else {
                return root.val + rec(root.left, low, high) + rec(root.right, low, high);
            }
        }

        else if (root.val > high){
            return rec(root.left, low, high);
        } 

        else if (root.val < low){
            return rec(root.right, low, high);
        }

        return 0;
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = rec(root, low, high);
        return ans;
    }
}