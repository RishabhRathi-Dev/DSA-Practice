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
    fun maxLevelSum(root: TreeNode?): Int {

        var levelSumMap : MutableMap<Int, Int> = mutableMapOf<Int, Int>()

        fun rec(node : TreeNode?, level : Int){

            if (level in levelSumMap.keys){
                levelSumMap.put(level, levelSumMap.get(level)!!.plus(node!!.`val`))
            } else {
                levelSumMap.put(level, node!!.`val`)
            }

            if (node!!.left == null && node!!.right == null){
                return
            } else {
                if (node!!.left != null){
                    rec(node!!.left, level.plus(1))
                }

                if (node!!.right != null){
                    rec(node!!.right, level.plus(1))
                }
            }
        }

        var m = -1000000
        var res = 0

        rec(root, 1)

        for (e in levelSumMap){
            if (e.value > m){
                m = e.value
                res = e.key
            }
        }

        return res
        
    }
}