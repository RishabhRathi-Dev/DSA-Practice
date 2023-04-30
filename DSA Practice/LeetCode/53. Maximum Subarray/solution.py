class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        m = -99999
        
        #brute
        """
        l = len(nums)
        for i in range(l):
            for j in range(i+1, l+1):
                ts = sum(nums[i:j])
                #print(ts)
                if ts > m:
                    m = ts
        """

        # two pointer won't work

        # dp - tabular
        dp = [*nums]
        for i in range(1, len(nums)):
            dp[i] = max(nums[i], nums[i] + dp[i-1])
        return max(dp)