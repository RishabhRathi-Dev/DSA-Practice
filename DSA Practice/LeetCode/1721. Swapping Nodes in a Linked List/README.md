# 1721. Swapping Nodes in a Linked List

You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

[Link](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/)

## Approach

Swapping the data instead of nodes.

I created 3 loops separate from one another

first loop goes through the linked list and mark the data we need to change and also calculate the length of the list

second loop goes till the the node we will be exchanging our data with and change its value to the previous one

third loop will do the deed for the first node and then break
