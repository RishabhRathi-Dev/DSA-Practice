# 1318. Minimum Flips to Make a OR b Equal to c

Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
Flip operation consists of change any single bit 1 to 0 or change the bit 0 to 1 in their binary representation.

[Link](https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/)

## Approach

- Convert to binary
- reverse the binary
- initialize a pointer that traverse till the end of max length of binary
- initialize default bit value as 0 and check if there is value in the converted
- if there is value assign it do the above for all three
- now for
    - 0 : check both of them to be 0 if not increase count
    - 1 : check either of them to be 1 if not increase count

complexity -> O(N) where N is the max length

space -> ig O(1)