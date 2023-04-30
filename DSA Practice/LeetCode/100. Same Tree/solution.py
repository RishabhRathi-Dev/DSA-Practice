# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:

        p_traverse = []
        q_traverse = []

        def rec(p, l):

            if p == None:
                return

            if p.left != None and p.right != None:
                rec(p.left, l)
                rec(p.right, l)

            elif p.left == None and p.right != None:
                l.append('null')
                rec(p.right, l)

            elif p.left != None and p.right == None:
                rec(p.left, l)
                l.append('null')

            elif p.left == None and p.right == None:
                pass

            l.append(p.val)


        rec(p, p_traverse)
        rec(q, q_traverse)

        return p_traverse == q_traverse
        