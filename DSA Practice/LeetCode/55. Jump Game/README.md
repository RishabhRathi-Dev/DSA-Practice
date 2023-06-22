# 55. Jump Game

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

[Link](https://leetcode.com/problems/jump-game/description/)

## Approach

top down dp

set last to true then check from last second that is there a true in its jump range

ans will be at dp[0]