# 703. Kth Largest Element in a Stream

Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Implement KthLargest class:

KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.

int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.

[Link](https://leetcode.com/problems/kth-largest-element-in-a-stream/description/)

## Approach

Python :
add -> sort -> -k index