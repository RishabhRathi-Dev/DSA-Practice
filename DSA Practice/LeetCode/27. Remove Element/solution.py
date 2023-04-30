class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        remain = 0
        index = 0
        while index < len(nums):
            i = nums[index]
            if i == val:
                nums.pop(index)
                index -= 1
            else :
                remain += 1

            index += 1

        return remain