WITH salary_rank AS
(
    SELECT
        E.name AS 'Employee',
        D.name AS 'Department',
        E.salary AS 'Salary',
        DENSE_RANK() OVER (PARTITION BY D.Name ORDER BY E.salary DESC) AS 'dense_rank'
    FROM
        Employee AS E 
        LEFT JOIN 
        Department AS D 
        ON E.departmentId = D.id
)

SELECT 
    Department,
    Employee,
    Salary
FROM salary_rank
WHERE salary_rank.dense_rank = 1

