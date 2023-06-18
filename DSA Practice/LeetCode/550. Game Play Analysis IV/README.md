# 550. Game Play Analysis IV

Table: Activity

    +--------------+---------+
    | Column Name  | Type    |
    +--------------+---------+
    | player_id    | int     |
    | device_id    | int     |
    | event_date   | date    |
    | games_played | int     |
    +--------------+---------+
    (player_id, event_date) is the primary key of this table.
    This table shows the activity of players of some games.
    Each row is a record of a player who logged in and played a number of games (possibly 0) before logging out on someday using some device.
 

Write an SQL query to report the fraction of players that logged in again on the day after the day they first logged in, rounded to 2 decimal places. In other words, you need to count the number of players that logged in for at least two consecutive days starting from their first login date, then divide that number by the total number of players.


[Link](https://leetcode.com/problems/game-play-analysis-iv/description/)

## Approach

Get first login [like](/DSA%20Practice/LeetCode/511.%20Game%20Play%20Analysis%20I/README.md)

then get count of total and get count of players who played consecutively 

then just divide and round

(Note: DateDiff(a, b) -> a - b so if a > b then answer will be negative)