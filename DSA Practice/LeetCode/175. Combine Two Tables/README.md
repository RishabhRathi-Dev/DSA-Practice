# 175. Combine Two Tables

Table: Person

    +-------------+---------+
    | Column Name | Type    |
    +-------------+---------+
    | personId    | int     |
    | lastName    | varchar |
    | firstName   | varchar |
    +-------------+---------+
    personId is the primary key column for this table.
This table contains information about the ID of some persons and their first and last names.
 

Table: Address

    +-------------+---------+
    | Column Name | Type    |
    +-------------+---------+
    | addressId   | int     |
    | personId    | int     |
    | city        | varchar |
    | state       | varchar |
    +-------------+---------+
    addressId is the primary key column for this table.
Each row of this table contains information about the city and state of one person with ID = PersonId.
 

Write an SQL query to report the first name, last name, city, and state of each person in the Person table. If the address of a personId is not present in the Address table, report null instead.

Return the result table in any order.

The query result format is in the following example.

[Link](https://leetcode.com/problems/combine-two-tables/description/)

## Approach 

Left Join