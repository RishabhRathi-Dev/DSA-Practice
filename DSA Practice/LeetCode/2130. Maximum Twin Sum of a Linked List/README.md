# 2130. Maximum Twin Sum of a Linked List

In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin.

Given the head of a linked list with even length, return the maximum twin sum of the linked list.

[List](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/)

## Approach

- Create a pointer at start (ref)

- create a stack of linked list values while traversing using head also calculate length while at it

- now till n/2 - 1 we keep poping and also using ref pointer to get both the required value then we can keep storing the max in value

- return the max value