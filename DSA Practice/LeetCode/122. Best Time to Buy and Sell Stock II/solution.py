class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minimum = prices[0]
        ans = 0
        for i in range(1, len(prices)):
            price = prices[i]
            if (price < minimum):
                minimum = price
            elif price > minimum:
                ans += price - minimum
                minimum = price
            
        return ans
        
