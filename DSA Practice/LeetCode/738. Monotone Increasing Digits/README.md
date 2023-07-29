# 738. Monotone Increasing Digits

An integer has monotone increasing digits if and only if each pair of adjacent digits x and y satisfy x <= y.

Given an integer n, return the largest number that is less than or equal to n with monotone increasing digits.

[Link](https://leetcode.com/problems/monotone-increasing-digits/description/)

## Approach

Convert to string then from left to right find till where pattern breaks make it 1 less and from there to last make all 9 then again start looking for pattern repeat till the end


31345

31345; 4 < 5

31345; 3 < 4

31345; 1 < 3

31345; 3 > 1 --- Break

so  

29999