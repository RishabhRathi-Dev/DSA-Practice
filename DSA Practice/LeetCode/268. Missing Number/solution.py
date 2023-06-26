class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums = sorted(nums)
        c = 0
        for i in nums:
            if c != i:
                break

            c += 1

        return c
        