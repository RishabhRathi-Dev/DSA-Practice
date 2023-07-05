# 1493. Longest Subarray of 1's After Deleting One Element

Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

[Link](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/)

## Approach

Sliding window with sum

- start summing up numbers
- if sum = right - left or right - left + 1  (+ because 0 indexed) then fine else subtract left number from sum and move left pointer 1 ahead
- initialize m to store the max value s has achieved
- if m is length of arr then -1 as 1 element has to be deleted else return m