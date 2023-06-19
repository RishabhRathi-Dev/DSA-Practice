class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k = k%len(nums)
        #print(nums[-k:], nums[:len(nums) - k])
        part1 = nums[-k:] 
        part2 = nums[:len(nums)-k]

        for i in range(k):
            nums[i] = part1[i]

        for i in range(k, len(nums)):
            nums[i] = part2[i-k]