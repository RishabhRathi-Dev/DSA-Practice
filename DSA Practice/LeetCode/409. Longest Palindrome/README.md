# 409. Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

[Link]()

## Approach

HashMap

- Calculate odd even

- iterate through the count if even add as it is if odd add the even part and leave 1 (odd = even + 1)

- check for any big odd remaining

- return the count