class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        arr = []

        def rec(idx, comb):
            if idx == n:
                arr.append(comb[:])
                return
            
            comb.append(nums[idx])
            rec(idx+1, comb)

            comb.pop()
            rec(idx+1, comb)

        rec(0, [])
        return arr