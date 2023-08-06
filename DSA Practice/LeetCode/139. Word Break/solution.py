class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        if "".join(wordDict) == s:
            return True
        @cache
        def rec(start, traveller, prev):
            if traveller == len(s):
                return start == len(s)

            while traveller <= len(s):
                if s[start:traveller] in wordDict:
                    a = rec(traveller, traveller, prev)
                    b = rec(start, traveller + 1, prev)

                    prev = a or b

                traveller += 1

            return prev

        return rec(0, 0, False)
            
