class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        index = 0
        for i in nums:
            if i == target:
                break
            elif i > target:
                break

            index += 1

        return index
