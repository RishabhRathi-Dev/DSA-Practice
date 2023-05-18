# 1557. Minimum Number of Vertices to Reach All Nodes

Given a directed acyclic graph, with n vertices numbered from 0 to n-1, and an array edges where edges[i] = [fromi, toi] represents a directed edge from node fromi to node toi.

Find the smallest set of vertices from which all nodes in the graph are reachable. It's guaranteed that a unique solution exists.

Notice that you can return the vertices in any order.

[Link](https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/description/)

## Approach

Find the nodes with in degree 0 as they are sure to be in the result and since there is 1 link which is non cyclic between other nodes it is sure that no other node will be required.