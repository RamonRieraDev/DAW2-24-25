-- 7. From the following table, write a SQL query to find the employee whose salary is 3000 and reporting person’s ID is 121. Return all fields.
SELECT * 
FROM employees
WHERE salary = (
	SELECT employee_id
    FROM employees
    WHERE employee_id=121 AND salary=3000
    )
    ;