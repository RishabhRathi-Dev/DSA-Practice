class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        ans = []
        potions = sorted(potions)

        lastIndex = len(potions)

        def higherOrEqual(low, high, target):
            if low >= high:
                return

            nonlocal lastIndex
            mid = (low + high)//2

            if potions[mid] >= target:
                if lastIndex > mid:
                    lastIndex = mid

                higherOrEqual(0, mid, target)

            elif potions[mid] < target:
                higherOrEqual(mid+1, high, target)

        for i in spells:
            succ = success/i
            higherOrEqual(0, lastIndex, succ)

            ans.append(len(potions) - lastIndex)
            lastIndex = len(potions)

        #print(ans)
        return ans