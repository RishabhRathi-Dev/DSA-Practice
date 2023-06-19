class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        index = [0] * n
        for i, j in trust:
            index[i-1] = -1
            index[j-1] += 1
        #print(index)
        if (n-1) in index:
            return index.index(n-1) + 1
        else :
            return -1
            