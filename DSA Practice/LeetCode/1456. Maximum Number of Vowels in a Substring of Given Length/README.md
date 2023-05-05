# 1456. Maximum Number of Vowels in a Substring of Given Length

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

[Link](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)

## Approach

Flexible Sliding Window

let's take example

Right checks the condition and left checks if it is passing by that condition and update vc accodingly

    left = 0
    right = 0
    vc = 0
    vc max (maximum) = 0

now let's take

    s = "abcdeibu"

in this

    r -> a
    l -> a
    vc = 1
    vc max = 1

    r -> b
    l -> a 
    vc = 1
    vc max = 1

    r -> c
    l -> a
    vc = 1
    vc max = 1

    r -> d
    l -> b
    vc = 0
    vc max = 1

    r -> e
    l -> c
    vc = 1
    vc max = 1

    r -> i
    l -> d
    vc = 2
    vc max = 2

    r -> b
    l -> e
    vc = 2
    vc max = 2

    r -> u
    l -> i
    vc = 2 (3 - 1)
    vc max = 2

So answer becomes 2