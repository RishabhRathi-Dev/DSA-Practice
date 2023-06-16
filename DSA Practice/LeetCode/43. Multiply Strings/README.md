# 43. Multiply Strings

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

[Link](https://leetcode.com/problems/multiply-strings/description/)

## Approach

Multiplication like we were taught to do in the start. Start from the end and multiply while adding the carry on the original and carry forwarding.

In this solution we store result of singular multiplication in array.

Important things:
- m * n = ans -> len(ans) = len(m) + len(n)
- result -> i + j + 1
- carry -> i + j

where i and j are reverse pointers

[learned from](https://leetcode.com/problems/multiply-strings/solutions/17605/easiest-java-solution-with-graph-explanation/)
