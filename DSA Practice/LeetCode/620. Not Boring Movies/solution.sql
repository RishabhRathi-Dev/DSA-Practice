SELECT
    *
FROM Cinema
WHERE

id % 2 = 1 AND description not like '%boring%'

ORDER BY
rating DESC