class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort()

        m = {}
        over = 0

        for start, end in intervals:

            if start in m.keys():
                # First to end
                m[start] = min(m[start], end)
                over += 1

            else :
                m[start] = end

        prevEnd = -100000
        for start, end in sorted(list(m.items())):

            if start < prevEnd:
                over += 1
                prevEnd = min(prevEnd, end)

            else :
                prevEnd = end


        return over





        