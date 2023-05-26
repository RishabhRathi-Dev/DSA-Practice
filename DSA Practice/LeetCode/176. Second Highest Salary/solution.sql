SELECT
    CASE 
    WHEN MAX(T.dens_rank) < 2 THEN NULL
    ELSE salary
    END
    AS SecondHighestSalary

FROM
    (
        SELECT 
            salary, DENSE_RANK() OVER (ORDER BY salary DESC) dens_rank
        FROM
            Employee
    ) AS T

WHERE
    T.dens_rank = 2;
