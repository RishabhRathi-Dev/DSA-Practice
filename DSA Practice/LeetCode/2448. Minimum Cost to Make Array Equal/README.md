# 2448. Minimum Cost to Make Array Equal

You are given two 0-indexed arrays nums and cost consisting each of n positive integers.

You can do the following operation any number of times:

Increase or decrease any element of the array nums by 1.
The cost of doing one operation on the ith element is cost[i].

Return the minimum total cost such that all the elements of the array nums become equal.

[Link](https://leetcode.com/problems/minimum-cost-to-make-array-equal/description/)

## Approach

Resource

- [Weighted Median](https://en.wikipedia.org/wiki/Weighted_median#:~:text=In%20statistics%2C%20a%20weighted%20median,central%20tendency%2C%20robust%20against%20outliers.)

- [Simple Explaination of weighted median](https://math.stackexchange.com/questions/863213/what-is-weighted-median)

- [minimizing the sum of weighted absolute distance](https://math.stackexchange.com/questions/1547336/minimizing-the-sum-of-weighted-absolute-distance)

[courtesy](https://leetcode.com/problems/minimum-cost-to-make-array-equal/solutions/2734183/python3-weighted-median-o-nlogn-with-explanations/)

### Observation
Think of the cost array as the weight of the corresponding num in the nums array. For example when nums = [1, 3, 5, 2] and cost = [2, 3, 1, 14], suppose we want to increase 1 in nums to 2, we know that the cost for this operation is 2. However, this is equivalent as if there are two 1’s in nums and we increase both of them to 2. Therefore, the minimum total cost such that all the elements of the array nums become equal is equivalent to the minimum total cost such that all the elements of the array

nums = [1, 1, 3, 3, 3, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]

become equal, with the cost of doing one operation on each element being 1. As such, the answer to this question is the total cost for moving all elements to the (unweighted) median in the new (collapsed) array. See also LC 462. Minimum Moves to Equal Array Elements II and LC 296. Best Meeting Point for practice of unweighted median problems.

### Implementation
We find the weighted median of nums by sorting the (num, weight) pair of the original arrays. We then use the weighted median (target) to calculate the minimum total cost such that all the elements of the array nums becomes equal, which is the answer to this question.

### Complexity
- Time Complexity: O(NlogN)
- Space Complexity: O(N), for the use of arr