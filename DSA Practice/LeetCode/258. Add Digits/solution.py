class Solution:
    def addDigits(self, num: int) -> int:
        s = num
        while s > 9:
            s = sum([int(i) for i in str(s)])

        return s