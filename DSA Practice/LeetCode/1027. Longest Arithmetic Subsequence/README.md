# 1027. Longest Arithmetic Subsequence

Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.

Note that:

- A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
- A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).

[Link](https://leetcode.com/problems/longest-arithmetic-subsequence/description/)

## Approach

    basically creates a data structure like this
            [
                {
                    diff1 : count1,
                    diff2 : count2,
                    .
                    .
                    .
                }
            ]

            this takes care of multiple ap that can start from a single
            number based on different d value.

    so we will update the count for each diff by one 

