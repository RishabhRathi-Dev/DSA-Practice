class Solution:
    def longestArithSeqLength(self, nums: List[int]) -> int:
        n = len(nums)
        if n <= 2:
            return n

        longest = 2
        dp = [{} for _ in range(n)]
        
        """
        This basically creates a data structure like this
        [
            {
                diff1 : count1,
                diff2 : count2,
                .
                .
                .
            }
        ]

        this takes care of multiple ap that can start from a single
        number based on different d value.
        """


        for i in range(n):
            for j in range(i):
                diff = nums[i] - nums[j]
                dp[i][diff] = dp[j].get(diff, 1) + 1 
                # Get is (index, returning integer if not found) like getOrDefault in java
                longest = max(longest, dp[i][diff])

        return longest