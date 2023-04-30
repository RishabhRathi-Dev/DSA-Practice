class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = {}
        
        for i in nums:
            if i in n.keys():
                n[i] += 1

            else :
                n[i] = 1

        ans = 0
        mm = 0
        for k, v in n.items():
            if v > mm:
                mm = v
                ans = k
                

        return ans