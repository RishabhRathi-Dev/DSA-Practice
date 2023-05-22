class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        m = {}
        res = []
        for i in nums:
            if i in m.keys():
                m[i] += 1
            else :
                m[i] = 1

        rank = sorted(list(m.values()), reverse = True)[:k]
        #print(rank)

        for x, v in m.items():
            if v in rank:
                res.append(x)

        return res