class Solution:
    def longestPalindrome(self, s: str) -> int:
        m = {}
        l = 0
        for i in s:
            if i in m.keys():
                m[i] += 1

            else:
                m[i] = 1

        k = list(m.values())

        for i in range(len(k)):
            if k[i]%2 == 0:
                l += k[i]

            else:
                l += k[i] - 1
                k[i] = 1

        k = sorted(k, reverse=True)

        for i in k:
            if i%2 != 0:
                l += i
                break

        return l