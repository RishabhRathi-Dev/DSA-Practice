class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        n = set(nums)
        s = len(nums)
        ans = []
        for i in n:
            if nums.count(i) > s/3:
                ans.append(i)


        return ans