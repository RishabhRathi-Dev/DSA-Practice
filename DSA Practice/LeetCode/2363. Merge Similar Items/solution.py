class Solution:
    def mergeSimilarItems(self, items1: List[List[int]], items2: List[List[int]]) -> List[List[int]]:
        ans = {}

        for k, v in items1:
            if k in ans.keys():
                ans[k] += v
            else:
                ans[k] = v

        for k, v in items2:
            if k in ans.keys():
                ans[k] += v
            else:
                ans[k] = v

        return sorted(list(ans.items()))