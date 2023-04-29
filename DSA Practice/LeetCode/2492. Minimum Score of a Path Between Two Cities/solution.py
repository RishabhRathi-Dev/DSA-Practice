class Solution:
    def minScore(self, n: int, roads: List[List[int]]) -> int:
        adj = defaultdict(list)

        for src, des, dis in roads:
            adj[src].append((des, dis))
            adj[des].append((src, dis))

        def dfs(i):
            if i in visit:
                return

            visit.add(i)
            nonlocal m

            for neig, dis in adj[i]:
                m = min(m, dis)
                dfs(neig)

        m = float("inf")
        visit = set()
        dfs(1)

        return m