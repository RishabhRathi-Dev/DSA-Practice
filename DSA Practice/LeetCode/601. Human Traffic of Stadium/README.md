# 601. Human Traffic of Stadium

Table: Stadium

    +---------------+---------+
    | Column Name   | Type    |
    +---------------+---------+
    | id            | int     |
    | visit_date    | date    |
    | people        | int     |
    +---------------+---------+
    visit_date is the primary key for this table.
    Each row of this table contains the visit date and visit id to the stadium with the number of people during the visit.
    No two rows will have the same visit_date, and as the id increases, the dates increase as well.
 

Write an SQL query to display the records with three or more rows with consecutive id's, and the number of people is greater than or equal to 100 for each.

Return the result table ordered by visit_date in ascending order.

The query result format is in the following example.

[Link](https://leetcode.com/problems/human-traffic-of-stadium/description/)

## Approach

use row number - id to create a single number for all consecutive then group them by that an select them if there count if greater than or equal to 3