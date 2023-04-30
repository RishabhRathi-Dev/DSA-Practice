# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def rec(head):
            if head == None:
                return 0

            if head.left != None and head.right != None:
                return max(1+rec(head.left), 1+rec(head.right))

            elif head.left != None and head.right == None:
                return 1 + rec(head.left)

            elif head.left == None and head.right != None:
                return 1 + rec(head.right)

            else :
                return 1

        ans = rec(root)

        #print(ans)
        return ans