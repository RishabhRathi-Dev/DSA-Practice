# 137. Single Number II

Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

[Link](https://leetcode.com/problems/single-number-ii/description/)

## Approach

(Sum of unique * 3 - sum of actual) // 2 -- python

java

same concept but instead of number itself we counting bits 

The usual bit manipulation code is bit hard to get and replicate. I like to think about the number in 32 bits and just count how many 1s are there in each bit, and sum %= 3 will clear it once it reaches 3. After running for all the numbers for each bit, if we have a 1, then that 1 belongs to the single number, we can simply move it back to its spot by doing ans |= sum << i;

This has complexity of O(32n), which is essentially O(n) and very easy to think and implement. Plus, you get a general solution for any times of occurrence. Say all the numbers have 5 times, just do sum %= 5.

[courtesy](https://leetcode.com/problems/single-number-ii/solutions/43297/java-o-n-easy-to-understand-solution-easily-extended-to-any-times-of-occurance/)


### GPT explaination

Here is a dry run of the code with an example input:

nums = [2, 2, 3, 2]

ans = 0

i = 0 sum = 0 j = 0 nums[0] = 2 (nums[0] >> i) & 1 = (2 >> 0) & 1 = 0 & 1 = 0 sum += 0 sum %= 3 sum = 0

j = 1 nums[1] = 2 (nums[1] >> i) & 1 = (2 >> 0) & 1 = 0 & 1 = 0 sum += 0 sum %= 3 sum = 0

j = 2 nums[2] = 3 (nums[2] >> i) & 1 = (3 >> 0) & 1 = 1 & 1 = 1 sum += 1 sum %= 3 sum = 1

j = 3 nums[3] = 2 (nums[3] >> i) & 1 = (2 >> 0) & 1 = 0 & 1 = 0 sum += 0 sum %= 3 sum = 1

sum != 0 ans |= sum << i ans |= (1 << 0) ans |= (00000001) ans = (00000001)

i = 1 sum = 0 j = 0 nums[0] = 2 (nums[0] >> i) & 1 = (2 >> 1) & 1 = (00000001) & (00000001) = (00000001) sum += (00000001) sum %= (00000011) sum = (00000001)

j = … … i = … …

The final value of ans is (00000011), which is equal to 3 in decimal. This is the single number that appears once in the array.



- Explaination

The code uses a loop to iterate over the 32 bit positions of the integers in the array. For each bit position, it uses another loop to iterate over the array elements and count the number of 1s in that bit position using bitwise right shift and bitwise AND operations. For example, if the array element is 2, which is (00000010) in binary, and the bit position is 0, then the right shift operation will move the bits one position to the right, resulting in (00000001), and the bitwise AND operation will compare each bit with 1 and return 1 only if both bits are 1, resulting in (00000000). This means that there is no 1 in the 0th bit position of 2. Similarly, if the array element is 3, which is (00000011) in binary, and the bit position is 0, then the right shift operation will not change the bits, and the bitwise AND operation will return (00000001), which means that there is a 1 in the 0th bit position of 3.

The code then modulates the sum of 1s by 3 using the modulo operator (%). This is because if a number appears three times in the array, then its contribution to the sum of 1s in each bit position will be a multiple of 3. For example, if the array contains three 2s, then their contribution to the sum of 1s in the first bit position will be 3 * (00000001) = (00000011), which is divisible by 3. Therefore, by taking the remainder of dividing the sum by 3, we can eliminate the effect of the numbers that appear three times and only keep the effect of the single number that appears once. For example, if the array contains three 2s and one 3, then their contribution to the sum of 1s in the first bit position will be 3 * (00000001) + (00000001) = (00000100), which has a remainder of 1 when divided by 3. This means that there is a 1 in the first bit position of the single number.

The code then uses bitwise OR operation to combine the bit values of the single number into a final answer. The bitwise OR operation compares each bit of two numbers and returns 1 if either bit is 1, otherwise returns 0. For example, if we have two numbers (00000100) and (00001000), then their bitwise OR result will be (00001100). This way, we can accumulate the bit values of the single number from each bit position into a final answer. For example, if we have found that there is a 1 in the first and second bit positions of the single number, then we can use bitwise OR to combine them into (00000011), which is equal to 3 in decimal.