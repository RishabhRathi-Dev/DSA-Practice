SELECT
    E.name AS 'name',
    B.bonus AS 'bonus'
FROM
    Employee E
    LEFT JOIN
    Bonus B
    ON E.empId = B.empId

WHERE
    B.Bonus < 1000 OR ISNULL(B.Bonus)
