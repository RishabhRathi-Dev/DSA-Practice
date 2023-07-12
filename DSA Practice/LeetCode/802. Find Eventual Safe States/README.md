# 802. Find Eventual Safe States

There is a directed graph of n nodes with each node labeled from 0 to n - 1. The graph is represented by a 0-indexed 2D integer array graph where graph[i] is an integer array of nodes adjacent to node i, meaning there is an edge from node i to each node in graph[i].

A node is a terminal node if there are no outgoing edges. A node is a safe node if every possible path starting from that node leads to a terminal node (or another safe node).

Return an array containing all the safe nodes of the graph. The answer should be sorted in ascending order.

[Link](https://leetcode.com/problems/find-eventual-safe-states/description/)

## Approach

DP with flags

so what we do is we go in rec and see if its neighbour node reaches from its all neighbour and so on to the target(terminal node) if not then our node won't as well

to make sure that dp table does not modify target we identify them first (len == 0) and then set there dp and flag to true.

Flags help in avoiding getting trapped in cycles

Dp helps in faster processing of recursion stack