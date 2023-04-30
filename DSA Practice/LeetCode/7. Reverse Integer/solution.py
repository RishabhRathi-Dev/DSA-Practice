class Solution:
    def reverse(self, x: int) -> int:
        re = 0
        if x > 0 :
            re = int(str(x)[::-1])
        elif x < 0 :
            re = -int(str(x)[1:][::-1])
        else:
            return 0

        if re in range(-2**31, 2**31 - 1):
            print(re)
            return re

        else:
            print("Not in specified")
            return 0