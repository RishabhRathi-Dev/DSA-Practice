
SELECT 
  id, 
  CASE
    WHEN isNull(p_id) THEN "Root"
    WHEN id in (SELECT p_id FROM Tree) THEN "Inner"
    ELSE "Leaf"
  END AS 'type'
  
FROM 
  Tree
