# 1050. Actors and Directors Who Cooperated At Least Three Times

Table: ActorDirector

    +-------------+---------+
    | Column Name | Type    |
    +-------------+---------+
    | actor_id    | int     |
    | director_id | int     |
    | timestamp   | int     |
    +-------------+---------+
    timestamp is the primary key column for this table.
 

Write a SQL query for a report that provides the pairs (actor_id, director_id) where the actor has cooperated with the director at least three times.

Return the result table in any order.

The query result format is in the following example.

[Link](https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/description/)

## Approach
Group and count time stamps