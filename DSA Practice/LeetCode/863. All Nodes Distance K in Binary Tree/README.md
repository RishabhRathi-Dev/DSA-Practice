# 863. All Nodes Distance K in Binary Tree

Given the root of a binary tree, the value of a target node target, and an integer k, return an array of the values of all nodes that have a distance k from the target node.

You can return the answer in any order.

[Link](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/description/)

## Approach

Convert tree to graph as we need to see in radial i.e. we have to be able to go up in tree that is only possible if we have reference of parent thus need to create new structure.

After this it is simple bfs once we reach the target level empty queue in the result list.