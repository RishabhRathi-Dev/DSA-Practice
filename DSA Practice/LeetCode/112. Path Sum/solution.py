# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:

        if root == None:
            return False

        def rec(node, s):
            if node == None:
                return False

            s += node.val
            
            if node.left == None and node.right == None:
                return s == targetSum

            if rec(node.left, s):
                return True

            if rec(node.right, s):
                return True

        
        res = rec(root, 0)

        return res
