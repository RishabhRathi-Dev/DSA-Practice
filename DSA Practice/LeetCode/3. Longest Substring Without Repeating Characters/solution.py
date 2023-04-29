class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = []
        m = 0

        if len(s) < 2:
            return len(s)

        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                had = set(s[i:j])
                #print(s[i:j], i, j)

                if len(had) == j-i:
                    m = len(had)

                else:
                    l.append(m)
                    #print(had, m)
                    break

            else:
                l.append(m)
            
        return max(l)
            
                 