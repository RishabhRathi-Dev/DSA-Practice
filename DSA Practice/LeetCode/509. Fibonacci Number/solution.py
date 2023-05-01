class Solution:
    def fib(self, n: int) -> int:
        if n == 0:
            return 0
        
        elif n == 1:
            return 1

        else :
            a = 0
            b = 1

            for _ in range(2, n+1):
                temp = a
                a = b
                b += temp

            return b