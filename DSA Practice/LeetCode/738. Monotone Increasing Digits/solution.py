class Solution:
    def monotoneIncreasingDigits(self, n: int) -> int:
        if n < 10:
            return n

        ints = []

        for i in str(n):
            ints.append(int(i))

        l = len(ints)
        last = l
        for i in range(l-1, 0, -1):
            if ints[i] < ints[i-1]:
                ints[i-1] -= 1
                last = i

            for i in range(last, l):
                ints[i] = 9

        return int("".join([str(i) for i in ints]))