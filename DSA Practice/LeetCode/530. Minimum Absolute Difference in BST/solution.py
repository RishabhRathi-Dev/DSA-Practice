# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        d = []

        def traverse(current):
            d.append(current.val)
            if current.left == None and current.right == None:
                return

            else:

                if current.right != None:
                    traverse(current.right)

                if current.left != None:
                    traverse(current.left)    

        traverse(root)
        
        m = 10000000

        for i in range(len(d)):
            for j in range(i+1, len(d)):
                m = min(m, abs(d[i] - d[j]))

        return m

            

            
            