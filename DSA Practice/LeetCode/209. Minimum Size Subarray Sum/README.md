# 209. Minimum Size Subarray Sum

Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

[Link](https://leetcode.com/problems/minimum-size-subarray-sum/description/)

## Approach

Sliding window with delayed turning off (My naming sense is out of bounds but you can call it as a fast and slow pointer method as well or simply two pointers)

- initialise two pointer left and right at 0
- initialise ans as Integer Max as holder of answer and sum (s) = 0
- start the loop with condition while left is less than n(length)
- In loop:
    - Check if sum if greater than or equal to target than update ans with min of (ans, right - left) then move left after subtracting from sum.
    - if sum is less than if right == n then also move left pointer if not then move right pointer and add value of right pointer to sum
- If ans if still integer max then return 0 else return ans