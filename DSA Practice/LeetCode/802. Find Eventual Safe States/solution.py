class Solution:
    def eventualSafeNodes(self, graph: List[List[int]]) -> List[int]:
        n = len(graph)
        dp = [False for i in range(n)]
        flag = [False for i in range(n)]

        def rec(node):
            if len(graph[node]) == 0:
                return True
            
            if flag[node] == True:
                return dp[node]

            flag[node] = True

            res = True
            

            for i in graph[node]:
                if rec(i) == False:
                    res = False
                    break
            
            
            dp[node] = res

            return dp[node]

        for i in range(n):
            if len(graph[i]) == 0:
                dp[i] = True
                flag[i] = True

        for i in range(n):
            rec(i)

        return [i for i in range(n) if dp[i]]