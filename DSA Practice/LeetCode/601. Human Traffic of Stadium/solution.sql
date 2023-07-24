WITH hun AS (
    SELECT
        *, id - row_number() OVER(ORDER BY id asc) as rnk
    FROM
        Stadium
    WHERE
        people >= 100
)
/*
id - row number as if consecutive they will negate each other so will have same value
*/
SELECT
    id, visit_date, people
FROM
    hun
WHERE
    rnk in (
        SELECT
            rnk
        FROM
            hun
        GROUP BY
            rnk
        HAVING 
            COUNT(*) >= 3
    )