# 111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

[Link](https://leetcode.com/problems/minimum-depth-of-binary-tree/description/)

## Approach

BFS

why? because in dfs we have to go down every node of the tree to get to the minimum but in bfs if we reach a leaf node we can terminate. So for minimum depth bfs is more suitable than dfs.