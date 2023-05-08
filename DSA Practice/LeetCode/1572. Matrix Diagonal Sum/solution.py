class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        s = 0
        f = 0
        b = len(mat[0]) - 1
        for i in mat:
            #print(i[f], i[b])
            s += i[f]
            i[f] = 0
            s += i[b]
            i[b] = 0

            f += 1
            b -= 1

        return s