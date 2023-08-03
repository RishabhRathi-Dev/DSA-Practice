# 290. Word Pattern

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

[Link](https://leetcode.com/problems/word-pattern/description/)

## Approach

map and also store already in set (or look from map) now if already seen comes again return false. length mismatch return false. mismatch from map return false. else return true