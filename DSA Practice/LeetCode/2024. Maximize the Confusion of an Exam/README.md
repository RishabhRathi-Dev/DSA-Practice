# 2024. Maximize the Confusion of an Exam

A teacher is writing a test with n true/false questions, with 'T' denoting true and 'F' denoting false. He wants to confuse the students by maximizing the number of consecutive questions with the same answer (multiple trues or multiple falses in a row).

You are given a string answerKey, where answerKey[i] is the original answer to the ith question. In addition, you are given an integer k, the maximum number of times you may perform the following operation:

Change the answer key for any question to 'T' or 'F' (i.e., set answerKey[i] to 'T' or 'F').
Return the maximum number of consecutive 'T's or 'F's in the answer key after performing the operation at most k times.

[Link](https://leetcode.com/problems/maximize-the-confusion-of-an-exam/description/)

## Approach

1. Sliding window for T and F and return max -> done in python
2. Using Queue instead of window [Courtesy](https://leetcode.com/problems/maximize-the-confusion-of-an-exam/solutions/1501080/java-solution-explanation/)

