# 180. Consecutive Numbers

Table: Logs

    +-------------+---------+
    | Column Name | Type    |
    +-------------+---------+
    | id          | int     |
    | num         | varchar |
    +-------------+---------+
    id is the primary key for this table.
    id is an autoincrement column.
 

Write an SQL query to find all numbers that appear at least three times consecutively.

Return the result table in any order.

The query result format is in the following example.
 

[Link](https://leetcode.com/problems/consecutive-numbers/description/)

## Approach 

Use three instances of the table and compare