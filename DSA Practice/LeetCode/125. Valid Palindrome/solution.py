class Solution:
    def isPalindrome(self, s: str) -> bool:
        target = ""
        for i in s:
            x = i.lower()
            if x.isalnum():
                target += x

        return target == target[::-1]