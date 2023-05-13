class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        m = {}
        
        sn = len(s)
        tn = len(t)

        if sn != tn:
            return False

        for i in range(sn):

            if s[i] in m.keys():
                m[s[i]] += 1

            else :
                m[s[i]] = 1

        for i in range(tn):
            if t[i] in m.keys():

                if m[t[i]] > 0:
                    m[t[i]] -= 1

                else:
                    return False

            else:
                return False

        return sum(m.values()) == 0 