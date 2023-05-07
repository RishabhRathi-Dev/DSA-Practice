# 70. Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

[Link](https://leetcode.com/problems/climbing-stairs/)

## Approach

Dynamic Programming :- 

We find the ways to climb current step by adding ways to climb previous 2 steps. (Since our max back is 2)

recusion can also be used