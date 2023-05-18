class Solution:
    def findSmallestSetOfVertices(self, n: int, edges: List[List[int]]) -> List[int]:
        inDegree = [0] * n

        for fro, to in edges:
            inDegree[to] += 1
            
        res = []

        for i in range(n):
            if inDegree[i] == 0:
                res.append(i)

        return res