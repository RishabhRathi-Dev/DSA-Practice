class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        tpointer = 0
        
        for i in s:
            if tpointer == len(t):
                break
            if i == t[tpointer]:
                tpointer += 1
        
        return len(t) - tpointer