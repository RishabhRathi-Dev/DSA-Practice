# 2090. K Radius Subarray Averages

You are given a 0-indexed array nums of n integers, and an integer k.

The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements in nums between the indices i - k and i + k (inclusive). If there are less than k elements before or after the index i, then the k-radius average is -1.

Build and return an array avgs of length n where avgs[i] is the k-radius average for the subarray centered at index i.

The average of x elements is the sum of the x elements divided by x, using integer division. The integer division truncates toward zero, which means losing its fractional part.

For example, the average of four elements 2, 3, 1, and 5 is (2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75, which truncates to 2.

[Link](https://leetcode.com/problems/k-radius-subarray-averages/description/)

## Approach

Sliding Window

- initialize answer array with -1
- sum till we reach 2k + 1
- once window reaches length of 2k we start updating the value of avg in left + right // 2
- subtract left from sum and increase left
- keep the loop running till right < length of array

Note:

If array is on length less than 2k than return [-1] array as it won't make window and it's useless to run loop for it

sum can be large use long