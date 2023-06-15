# 1161. Maximum Level Sum of a Binary Tree

Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

[Link](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/)

## Apporach

BFS style can be used but I am going with DFS plus hashmap to store level sum

- initialize hashmap <level, sum>
- begin dfs with level and node as args
- keep doing till dfs done
- get key of max value