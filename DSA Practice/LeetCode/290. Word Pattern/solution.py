class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        p = list(pattern)
        sl = s.split(" ")

        if len(p) != len(sl):
            return False
        
        cache = {}

        seen = set()

        for i, j in zip(p, sl):
            if i in cache.keys():
                if cache[i] != j:
                    return False
            else:
                if j in seen:
                    return False
                    
                cache[i] = j
                seen.add(j)

        
        return True