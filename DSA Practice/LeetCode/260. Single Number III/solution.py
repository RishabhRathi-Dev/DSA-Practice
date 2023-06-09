class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        m = {}

        for i in nums:
            if i in m.keys():
                m[i] += 1
            else:
                m[i] = 1

        ans = []
        for k, v in m.items():
            if v == 1:
                ans.append(k)

        return ans