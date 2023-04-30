class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        short = min(len(word1), len(word2))
        ans = ""
        oneGreater = len(word1) > len(word2)
        for i in range(short):
            ans += word1[i] + word2[i]

        if oneGreater:
            ans += word1[short:]
        else :
            ans += word2[short:]

        return ans

        
