"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':

        queue = [root]

        levelLength = 0
        while (len(queue) > 0):
            levelLength = len(queue)
            prev = None
            if queue[0] == None:
                break
            for _ in range(levelLength):
                queue[0].next = prev
                prev = queue[0]

                if queue[0].right != None:
                    queue.append(queue[0].right)
                if queue[0].left != None:
                    queue.append(queue[0].left)

                queue.pop(0)
            
        return root
