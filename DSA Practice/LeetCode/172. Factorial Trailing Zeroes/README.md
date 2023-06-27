# 172. Factorial Trailing Zeroes

Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

[Link](https://leetcode.com/problems/factorial-trailing-zeroes/description/)

## Approach

since we have to calculate 0's we know that 0 comes when 5 is multiplied by any even number and by 10

so we can go like this considering number is 30

    30 // 5 -> 6
    6 // 5 -> 1
    1 // 5 -> 0

    6 + 1 + 0 => 7

    ie. 7 0's 