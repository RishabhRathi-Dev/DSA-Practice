# 852. Peak Index in a Mountain Array

An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

Constraints:

3 <= arr.length <= 105

0 <= arr[i] <= 106

arr is guaranteed to be a mountain array.

[Link](https://leetcode.com/problems/peak-index-in-a-mountain-array/description/)

## Approach

well kinda cheat as in question it mentioned that arr is guranteed to be mountain arr, now if that is the case then i just have to find index of max value in arr