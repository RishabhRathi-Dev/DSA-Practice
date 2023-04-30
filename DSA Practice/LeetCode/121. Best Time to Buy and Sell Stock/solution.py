class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        m = 0
        left = 0
        right = 1

        while right < len(prices):
            p = prices[right] - prices[left]

            if prices[right] > prices[left]:
                m = max(p, m)

            else:
                left = right

            right += 1

        return m