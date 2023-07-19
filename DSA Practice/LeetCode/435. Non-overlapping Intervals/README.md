# 435. Non-overlapping Intervals

Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

[Link](https://leetcode.com/problems/non-overlapping-intervals/description/)

## Approach

Greedy kinda

sort the list based on start

then take smaller intervals for all common starts
that are not are to be removed so add 1 for each

store those in a dataset (i used dict)

now traverse over that and see if start is less then end of previous if yes then add 1 to remove and update prevEnd to min of current and prev

Approach good for memory but real bad for runtime


### Time taken : 32:57 min