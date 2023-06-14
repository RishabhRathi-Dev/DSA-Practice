# 41. First Missing Positive

Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

[Link](https://leetcode.com/problems/first-missing-positive/description/)

## Approach

We know that sum of n natural numbers (i.e. positive numbers) is 

        n * (n + 1)
            -------
                2

so to find the first missing positive number we can create a sum variable which is sum of unique numbers till now in the list and then compare it with the mathematical one if there is a difference then that number is the missing number

or we can calculate the difference and check if the current number in the list is that calculated number or not