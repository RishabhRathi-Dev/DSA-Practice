WITH t AS (
    SELECT COUNT(DISTINCT(A3.player_id)) AS tot FROM Activity A3
),

f AS (
    SELECT 
    player_id,
    MIN(event_date) AS 'first_login'
    FROM
        Activity

    GROUP BY
        player_id
),

p as (
    SELECT COUNT(DISTINCT(A1.player_id)) AS pla FROM f A1, Activity A2
WHERE
    DATEDIFF(A1.first_login, A2.event_date) = -1 AND A1.player_id = A2.player_id

)

SELECT
    ROUND(pla/tot, 2) 'fraction'
FROM
    p, t
