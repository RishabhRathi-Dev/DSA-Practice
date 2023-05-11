class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        n = [str(i) for i in nums]
        s = ""
        for i in n:
            s += i

        return [int(i) for i in s]