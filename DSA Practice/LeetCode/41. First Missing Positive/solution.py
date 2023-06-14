class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums = [i for i in set(nums) if i > 0]
        nums = sorted(nums)
        s = 0
        n = 1

        if len(nums) == 0:
            return 1
        
        for i in range(len(nums)):
            ts = n * (n + 1)/2
            cn = ts - s
            #print(nums, ts, s, cn)
            if nums[i] == cn:
                s += cn
                n += 1

            else:
                return int(cn)

        return nums[-1] + 1