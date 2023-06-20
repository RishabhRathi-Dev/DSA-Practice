class Solution:
    def getAverages(self, nums: List[int], k: int) -> List[int]:
        n = len(nums)
        res = [-1] * n

        if n < (k*2) + 1:
            return res

        # sliding window of upto 2k

        left = 0
        right = 0
        current_sum = 0
        d = 2*k + 1
        while(right < n):
            current_sum += nums[right]
            #print(current_sum, right - left)
            if (right - left == 2*k):
                res[(right + left)//2] = current_sum // d
                current_sum -= nums[left]
                left += 1

            right += 1

        return res