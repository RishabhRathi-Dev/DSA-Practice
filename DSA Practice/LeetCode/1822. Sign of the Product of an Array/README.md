# 1822. Sign of the Product of an Array

There is a function signFunc(x) that returns:

1 if x is positive.

-1 if x is negative.

0 if x is equal to 0.

You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

[Link](https://leetcode.com/problems/sign-of-the-product-of-an-array/)

## Approach 
Make a sign keeper variable which tracks sign as there is no need to multiply whole array to check sign.