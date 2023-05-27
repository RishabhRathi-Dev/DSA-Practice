CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
        SELECT
            CASE
            WHEN MAX(T.dens_rank) < N THEN NULL
            ELSE salary
            END

        FROM
            (
                SELECT 
                    salary, DENSE_RANK() OVER (ORDER BY salary DESC) dens_rank
                FROM 
                    Employee
            ) AS T

        WHERE T.dens_rank = N
      
  );
END