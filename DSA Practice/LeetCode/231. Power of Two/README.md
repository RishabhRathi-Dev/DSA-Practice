# 231. Power of Two

Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

[Link](https://leetcode.com/problems/power-of-two/description/)

## Approach

Bit manipulation and masking

mostly query along with left shift operator till n > 0. Basically we are query and seeing the count of 1 if it gets more than 1 then we return false.