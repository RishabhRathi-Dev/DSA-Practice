# 626. Exchange Seats

Table: Seat

    +-------------+---------+
    | Column Name | Type    |
    +-------------+---------+
    | id          | int     |
    | student     | varchar |
    +-------------+---------+
    id is the primary key column for this table.
    Each row of this table indicates the name and the ID of a student.
    id is a continuous increment.
 

Write an SQL query to swap the seat id of every two consecutive students. If the number of students is odd, the id of the last student is not swapped.

Return the result table ordered by id in ascending order.

The query result format is in the following example.

[Link](https://leetcode.com/problems/exchange-seats/description/)

## Approach

ROW_Number as id and do it over(id if even id-1 else id + 1)

basically changing the id column itself with new one made by row_number and giving new id based on order by 