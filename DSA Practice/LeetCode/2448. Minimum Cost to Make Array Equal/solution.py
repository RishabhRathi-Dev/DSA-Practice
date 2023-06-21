class Solution:
    def minCost(self, nums: List[int], cost: List[int]) -> int:
        arr = sorted(zip(nums, cost))
        total, count = sum(cost), 0
        print(arr, total, count)
        for num, c in arr:
            count += c
            if count > total // 2:
                target = num
                break
        return sum(numCost * abs(num - target) for num, numCost in arr)  