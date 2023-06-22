# 714. Best Time to Buy and Sell Stock with Transaction Fee

You are given an array prices where prices[i] is the price of a given stock on the ith day, and an integer fee representing a transaction fee.

Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

[Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/)

## Approach

[Greedy](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/solutions/201603/python-greedy-is-good/)

minimum is first buy then 

if next price is less than minimum than update minimum to that

if next price is greater than fees + minimum than update ans += price - fee - minimum and minimum to price - fees (since we didn't got the whole)