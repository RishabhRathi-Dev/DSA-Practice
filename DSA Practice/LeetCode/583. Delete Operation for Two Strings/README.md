# 583. Delete Operation for Two Strings

Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.

In one step, you can delete exactly one character in either string.

 

[Link](https://leetcode.com/problems/delete-operation-for-two-strings/)

## Approach

 Basically in this we are taking minimum string them calculating the longest common
            substring (In same sequence with string in between possible) then subtracting twice of it from total length to get min removed

This is done using dp (2 dp) current and last to check which gives maximum