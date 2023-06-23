class Solution:
    def findValueOfPartition(self, nums: List[int]) -> int:
        nums = sorted(nums)
        return min(nums[i] - nums[i-1] for i in range(1, len(nums)))