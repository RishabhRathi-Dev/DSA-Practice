# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        levelSumMap = {}

        def rec(node, level):
            if level in levelSumMap.keys():
                levelSumMap[level] += node.val
            else:
                levelSumMap[level] = node.val

            if node.left == None and node.right == None:
                return
            else:
                if node.left != None:
                    rec(node.left, level+1)

                if node.right != None:
                    rec(node.right, level+1)

        rec(root, 1)
        #print(levelSumMap)

        m = -1000000
        res = 0
        for k,v in levelSumMap.items():
            if v > m:
                m = v
                res = k

        return res