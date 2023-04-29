# 2348. Number of Zero-Filled Subarrays

Given an integer array nums, return the number of subarrays filled with 0.

A subarray is a contiguous non-empty sequence of elements within an array.

[Link](https://leetcode.com/problems/number-of-zero-filled-subarrays/)

## My Approach

Let's understand my approach with an example (dry run)

suppose we have an array [1, 2, 0, 0, 5, 7, 0]
now according to question we can deduce that we have to to permutation and combination method.

now the answer for the above should be [0], [0], [0,0], [0,0,0]

so now if we have to do this in O(N) then lets go through loop

first at 0 ; count += streak, streak ++ (1, 1)

0 ; (3, 2); why cause there are three subarray that can be created [0], [0], [0, 0]

last 0; (4, 1); with previous add the last arrangement [0, 0, 0]

