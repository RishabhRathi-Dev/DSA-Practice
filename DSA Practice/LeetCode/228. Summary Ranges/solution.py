class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:

        l = len(nums)

        if l == 0:
            return []
        
        if l == 1:
            return [str(nums[0])]

        pointer = 0
        pointer_val = nums[pointer]
        pointer_flag = 0
        res = []

        nums.append(nums[-1] + 10) #dummy data to act as safe guard
        l = len(nums)

        while (pointer < l):
            #print(nums[pointer_flag], nums[pointer], pointer_val)
            if pointer_val != nums[pointer]:
                if pointer - pointer_flag == 1:
                    res.append(str(nums[pointer_flag]))

                else:
                    res.append(str(nums[pointer_flag]) + "->" + str(nums[pointer-1]))

                pointer_flag = pointer
                pointer_val = nums[pointer]

            
            pointer += 1
            pointer_val += 1

        return res


