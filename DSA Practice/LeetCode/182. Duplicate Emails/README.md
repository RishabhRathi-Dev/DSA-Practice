# 182. Duplicate Emails

Table: Person

    +-------------+---------+
    | Column Name | Type    |
    +-------------+---------+
    | id          | int     |
    | email       | varchar |
    +-------------+---------+
    id is the primary key column for this table.
    Each row of this table contains an email. The emails will not contain uppercase letters.
 

Write an SQL query to report all the duplicate emails. Note that it's guaranteed that the email field is not NULL.

Return the result table in any order.

The query result format is in the following example.

[Link](https://leetcode.com/problems/duplicate-emails/description/)

## Approach 

Group By email then select email having count > 1