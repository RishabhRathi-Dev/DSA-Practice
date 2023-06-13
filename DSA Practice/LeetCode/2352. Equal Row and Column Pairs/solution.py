class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        container = []
        res = 0
        n = len(grid)

        for i in range(n):
            cr = "-".join([str(o) for o in grid[i]])
            container.append(cr)

        for i in range(n):
            cc = []
            for j in grid:
                cc.append(str(j[i]))

            cc = "-".join(cc)

            if cc in container:
                #print(cc)
                res += container.count(cc)

        #print(container)

        return res