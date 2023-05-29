# 177. Nth Highest Salary

Table: Employee

    +-------------+------+
    | Column Name | Type |
    +-------------+------+
    | id          | int  |
    | salary      | int  |
    +-------------+------+
    id is the primary key column for this table.
Each row of this table contains information about the salary of an employee.
 

Write an SQL query to report the nth highest salary from the Employee table. If there is no nth highest salary, the query should report null.

The query result format is in the following example.

[Link](https://leetcode.com/problems/nth-highest-salary/description/)

## Approach

rank using DENSE_RANK over the desc order of salary then checking if the max rank is in the desired else return null