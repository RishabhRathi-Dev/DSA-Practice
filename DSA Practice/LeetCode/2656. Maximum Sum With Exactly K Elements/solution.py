class Solution:
    def maximizeSum(self, nums: List[int], k: int) -> int:
        nums.sort()
        s = 0
        for i in range(k):
            n = nums.pop()
            s += n
            nums.append(n+1)

        return s
            