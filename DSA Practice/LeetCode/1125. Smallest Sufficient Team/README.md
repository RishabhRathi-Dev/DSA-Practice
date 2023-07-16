# 1125. Smallest Sufficient Team

[Link]()

## Approach 

initial:

- convet skills to number
- find the set with sum with min error

problem : got tle 36/38 :(

Solution look at editorial

[link](https://leetcode.com/problems/smallest-sufficient-team/editorial/)

### Good luck future me trying to understand it

<p>
Approach 2: Top-Down Dynamic Programming (Memoization)
Intuition
In this approach, we will calculate the same DP as in the previous one, but the manner of organizing computations will differ.

We will use the recursive function f(skillsMask)f(\text{skillsMask})f(skillsMask) that returns the value of dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask].

One can rewrite the DP recurrence relation in terms of fff as follows. For all iii from 000 to n−1n - 1n−1, update dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask] with the bitmask f(smallerSkillsMask) OR 2if(\text{smallerSkillsMask}) \text{ OR } 2^if(smallerSkillsMask) OR 2 
i
 .

When we call f(skillsMask)f(\text{skillsMask})f(skillsMask) for the first time, we calculate the result for skillsMask\text{skillsMask}skillsMask and write it into dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask]. When we call f(skillsMask)f(\text{skillsMask})f(skillsMask) after that, we immediately return dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask] computed earlier.

The answer to the problem is the team f(2m−1)=dp[2m−1]f(2^m - 1) = \text{dp}[2^m - 1]f(2 
m
 −1)=dp[2 
m
 −1].

There remains one small technical question: how to know whether we call f(skillsMask)f(\text{skillsMask})f(skillsMask) for the first time and need to compute the result, or we call it later and can return dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask] found earlier? One can handle this by initializing the dp\text{dp}dp array with the value of −1-1−1. Then dp[skillsMask]=−1\text{dp}[\text{skillsMask}] = -1dp[skillsMask]=−1 will mean that we have not calculated f(skillsMask)f(\text{skillsMask})f(skillsMask) yet. As soon as we find the result of f(skillsMask)f(\text{skillsMask})f(skillsMask), we will write it into dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask], and this value will not be −1-1−1 anymore.

Algorithm
The function fff takes a parameter skillsMask\text{skillsMask}skillsMask.

If dp[skillsMask]≠−1\text{dp}[\text{skillsMask}] \ne -1dp[skillsMask]

=−1, return dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask] (the value computed earlier).
Iterate iii from 000 to n−1n - 1n−1. Try to update dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask] with a team containing the ithi^\text{th}i 
th
  person.
Set smallerSkillsMask=skillsMask∖skillsMaskOfPerson[i]\text{smallerSkillsMask} = \text{skillsMask} \setminus \text{skillsMaskOfPerson}[i]smallerSkillsMask=skillsMask∖skillsMaskOfPerson[i].
If smallerSkillsMask≠skillsMask\text{smallerSkillsMask} \ne \text{skillsMask}smallerSkillsMask

=skillsMask.
Set peopleMask=f(smallerSkillsMask)\text{peopleMask} = f(\text{smallerSkillsMask})peopleMask=f(smallerSkillsMask).
If dp[skillsMask]=−1\text{dp}[\text{skillsMask}] = -1dp[skillsMask]=−1 (we have not found any team for skillsMask\text{skillsMask}skillsMask yet) or peopleMask OR 2i\text{peopleMask} \text{ OR } 2^ipeopleMask OR 2 
i
  is smaller than the current team dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask], update dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask] with peopleMask OR 2i\text{peopleMask} \text{ OR } 2^ipeopleMask OR 2 
i
 .
Return dp[skillsMask]\text{dp}[\text{skillsMask}]dp[skillsMask].
Before calling fff we need to precalculate skillsMaskOfPerson[i]\text{skillsMaskOfPerson}[i]skillsMaskOfPerson[i] for all iii. Also, we initialize dp[0]=0\text{dp}[0] = 0dp[0]=0 as the base case and all other elements to -1.

The answer to the problem is f(2m−1)f(2^m - 1)f(2 
m
 −1).
</p>