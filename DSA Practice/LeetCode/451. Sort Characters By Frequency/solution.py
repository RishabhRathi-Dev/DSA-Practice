class Solution:
    def frequencySort(self, s: str) -> str:
        freq = {}

        for c in s:
            if (c in freq.keys()):
                freq[c] += 1
            else :
                freq[c] = 1

        m = len(s)

        ans = ""

        while (len(ans) < len(s)):
            for k, v in freq.items():
                if v == m:
                    for i in range(v):
                        ans += k
            
            m -= 1
        

        return ans