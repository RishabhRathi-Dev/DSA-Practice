class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        m = {}

        if len(nums) == len(set(nums)):
            return False

        else :
            for i in nums:
                if i in m.keys():
                    m[i] += 1
                    if m[i] >= 2:
                        return True

                else :
                    m[i] = 1

        return False