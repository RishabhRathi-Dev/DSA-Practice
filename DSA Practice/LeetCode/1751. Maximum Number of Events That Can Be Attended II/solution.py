class Solution:
    def maxValue(self, events: List[List[int]], k: int) -> int:
        n = len(events)
        events.sort()
        @lru_cache(None)
        def rec(end, index, k):
            if k == 0 or index == n:
               return 0
            
            event = events[index]

            estart, eend, evalue = event

            if estart <= end:
                # not possible to attend
                return rec(end, index+1, k)

            attend = evalue + rec(eend, index+1, k-1)
            skip = rec(end, index+1, k)

            return max(attend, skip)

        rec.cache_clear()
        return rec(0, 0, k)