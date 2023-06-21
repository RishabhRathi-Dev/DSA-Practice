# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:

        def rec(node):
            if node == None:
                return 0

            if high >= node.val >= low:
                if node.val == low:
                    return node.val + rec(node.right)
                elif node.val == high:
                    return node.val + rec(node.left)
                else:
                    return node.val + rec(node.left) + rec(node.right)

            elif node.val > high:
                return rec(node.left)

            elif node.val < low:
                return rec(node.right)

        ans = rec(root)

        print(ans)
        return ans