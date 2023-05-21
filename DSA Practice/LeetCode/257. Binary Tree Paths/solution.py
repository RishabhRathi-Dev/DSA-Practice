# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        bt = []
        ans = []

        def rec(root):

            if root == None:
                return

            bt.append(root.val)

            if root.left != None:
                rec(root.left)
                bt.pop()

            if root.right != None:
                rec(root.right)
                bt.pop()

            if root.left == None and root.right == None:
                ans.append("->".join([str(i) for i in bt]))
                return
        
        rec(root)
        return ans