# 236. Lowest Common Ancestor of a Binary Tree

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

[Link](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)

## Approach

if target then return target from the dfs else return null

basically we are seeing that we return parent of the target node by comparing the left and right 

- return root only for target or if null

then dfs to left and right

- left -> null right -> null => null
- left -> val right -> null => left
- left -> null right -> val => right
- left -> val right -> val => root

