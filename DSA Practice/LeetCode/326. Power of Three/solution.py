class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        
        def rec(n):
            if n == 1:
                return True

            elif n < 1:
                return False

            if n % 3 == 0:
                return rec(n/3)

            else :
                return False

        return rec(n)