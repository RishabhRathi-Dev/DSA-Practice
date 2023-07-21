class Solution:
    def findNumberOfLIS(self, nums: List[int]) -> int:
        if not nums: 
            return 0
            
        n = len(nums)
        m = 0
        dp = [1] * n
        count = [1] * n

        for i in range(n):
            for j in range(i):
                if nums[j] < nums[i]:

                    if dp[i] < dp[j]+1: 
                        dp[i], count[i] = dp[j]+1, count[j]

                    elif dp[i] == dp[j]+1: 
                        count[i] += count[j]

            m = max(m, dp[i])                        
        return sum(c for l, c in zip(dp, count) if l == m)