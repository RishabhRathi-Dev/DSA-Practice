class Solution:
    def convert(self, s: str, numRows: int) -> str:
        n = numRows
        if n == 1: 
            return s
        rows = ['' for _ in range(n)]
        j, d = 0, 1
        for i in range(len(s)):
            # add the current character to corresponding row
            rows[j] += s[i]
            # if it reaches to the last row, we need to go up
            if j == n - 1: 
                d = -1
            # if it reaches to the first row, we need to go down
            elif j == 0: 
                d = 1
            # move j pointer
            j += d
       
        return ''.join(rows)