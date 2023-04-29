class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = {}
        for i in range(len(nums)):
            need = target - nums[i]

            if need in nums:
                
                if nums.index(need) == i:
                    continue

                else:
                    return [nums.index(need), i]