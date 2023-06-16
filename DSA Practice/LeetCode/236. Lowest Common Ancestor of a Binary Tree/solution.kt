/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun dfs(root: TreeNode?, p: TreeNode?, q: TreeNode?) : TreeNode? {
        if (root == p || root == q || root == null){
            return root
        }

        var leftResult : TreeNode? = dfs(root.left, p, q)
        var rightResult : TreeNode? = dfs(root.right, p, q)

        if (leftResult == null && rightResult == null){
            return null
        }

        if (leftResult != null && rightResult != null){
            return root
        }

        if (leftResult == null){
            return rightResult
        } else {
            return leftResult
        }
    }

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        return dfs(root, p, q)
    }
}