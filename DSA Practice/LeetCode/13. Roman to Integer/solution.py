class Solution:
    def romanToInt(self, s: str) -> int:
        val = {"I":1,
                "V":5,
                "X":10,
                "L":50,
                "C":100,
                "D":500,
                "M":1000}
        ans = 0
        for i in range(len(s)-2, -1, -1):
            if val[s[i]] >= val[s[i+1]]:
                ans += val[s[i]]
            else:
                ans -= val[s[i+1]]

        return ans