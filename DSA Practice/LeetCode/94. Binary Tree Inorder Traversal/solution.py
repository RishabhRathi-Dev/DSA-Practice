# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        traversal = []

        def rec(root):
            if root == None:
                return 

            if root.left != None:
                rec(root.left)

            traversal.append(root.val)


            if root.right != None:
                rec(root.right)

        rec(root)
        return traversal
             