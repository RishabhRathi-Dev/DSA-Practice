# 2486. Append Characters to String to Make Subsequence

You are given two strings s and t consisting of only lowercase English letters.

Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.

A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.

[Link](https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/description/)

## Approach

we can initialize a pointer which matches character from t with the loop in s if match then pointer increase 

our answer will be len(t) - tpointer