SELECT
    product_id, year as 'first_year', quantity, price
FROM
    Sales
WHERE
    (product_id, year) in (SELECT product_id, min(year) AS year FROM SALES GROUP BY product_id)