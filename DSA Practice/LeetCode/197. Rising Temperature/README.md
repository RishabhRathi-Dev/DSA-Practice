# 197. Rising Temperature

Table: Weather

    +---------------+---------+
    | Column Name   | Type    |
    +---------------+---------+
    | id            | int     |
    | recordDate    | date    |
    | temperature   | int     |
    +---------------+---------+
    id is the primary key for this table.
    This table contains information about the temperature on a certain day.
 

Write an SQL query to find all dates' Id with higher temperatures compared to its previous dates (yesterday).

Return the result table in any order.

The query result format is in the following example.

[Link](https://leetcode.com/problems/rising-temperature/description/)

## Approach
two pointer then date diff = 1 and temp1 > temp2