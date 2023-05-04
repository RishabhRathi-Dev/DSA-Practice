class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        count = 0

        pointer = 0

        while(pointer < len(nums)):
            if nums[pointer] == 0:
                count += 1
                nums.pop(pointer)

            else:

                pointer += 1

        for i in range(count):
            nums.append(0)

