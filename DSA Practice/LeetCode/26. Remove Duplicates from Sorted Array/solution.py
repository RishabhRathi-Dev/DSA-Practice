class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        have = set()
        index = 0

        while index < len(nums):
            i = nums[index]
            if i not in have:
                have.add(i)
                print(i)

            else:
                nums.pop(index)
                index -= 1

            index += 1
            #print(nums, have)

        #print(nums, have, count)

        return len(have)