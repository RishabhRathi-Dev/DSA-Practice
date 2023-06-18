WITH data AS (
    SELECT
        T.request_at,
        T.status <> 'completed' AS 'IsCancelled'
    
    FROM
        Trips T
        JOIN
        Users C ON (T.client_id = C.users_id AND C.banned = 'No')
        JOIN
        Users D ON (T.driver_id = D.users_id AND D.banned = 'No')

    WHERE
        T.request_at BETWEEN '2013-10-01' AND '2013-10-03'
)

SELECT
    request_at AS 'Day',
    ROUND(
        CAST(SUM(IsCancelled) AS REAL) / CAST(COUNT(*) AS REAL), 2
    ) 'Cancellation Rate'

FROM
    data
GROUP By
    request_at
