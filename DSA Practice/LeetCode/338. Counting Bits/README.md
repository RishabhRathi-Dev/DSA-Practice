# 338. Counting Bits

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

[Link](https://leetcode.com/problems/counting-bits/description/)

## Approach

Batch wise

    0
    1
    2
    2-4
    4-8
    8-16
    .
    .

    in each number of 1 is the start of batch + remainder when divided by 2

    0 -> 0 + 0
    1 -> 0 + 1
    2 -> 1 + 0
    3 -> 1 (1) + 1 (remainder)
    4 -> 1 (2) + 0
    5 -> 1 (2) + 1
    6 -> 2 (3) + 0
    7 -> 2 (3) + 1
    8 -> 1 (4) + 0

    and so on