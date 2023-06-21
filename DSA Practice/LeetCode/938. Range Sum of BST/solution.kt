/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun rec(root : TreeNode?, low : Int, high : Int) : Int {
        if (root == null){
            return 0;
        }

        if (root.`val` >= low && root.`val` <= high){
            if (root.`val` == low){
                return root.`val` + rec(root.right, low, high)
            } 

            else if (root.`val` == high){
                return root.`val` + rec(root.left, low, high)
            }

            else {
                return root.`val` + rec(root.left, low, high) + rec(root.right, low, high)
            }
        }

        else if (root.`val` > high){
            return rec(root.left, low, high)
        }

        else if (root.`val` < low){
            return rec(root.right, low, high)
        }

        return 0 //obligatory will not reach here
    }

    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        var ans = rec(root, low, high)
        return ans
    }
}