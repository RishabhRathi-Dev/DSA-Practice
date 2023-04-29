# 1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## My Approach

I have used hashmap to store the value and the target value needed to create the sum. If the target value is present and is not the current value against which we are searching in the nums list provided then we have a match.

Return those indexs and done