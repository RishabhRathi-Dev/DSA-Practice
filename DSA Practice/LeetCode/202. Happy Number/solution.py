class Solution:
    def isHappy(self, n: int) -> bool:
        while n >= 1:
            temp = sum([int(i)**2 for i in str(n)])
            n = temp
            print(n)
            if n == 1 or n == 7:
                return True

            elif n < 10:
                return False