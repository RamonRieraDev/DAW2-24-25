-- 1. From the following tables, write a SQL query to find all salespeople and customers located in the city of London.
/*(SELECT salesman_id, name
FROM salesman
WHERE city="Rome"
)
UNION 
(SELECT customer_id, cust_name 
FROM customer
WHERE city="London"
)
ORDER BY salesman_id;
;
*/

-- 2. From the following tables, write a SQL query to find distinct salespeople and their cities. Return salesperson ID and city.
/*(SELECT salesman_id, city
FROM customer  
)
UNION  
(SELECT salesman_id, city
FROM salesman
)
ORDER BY salesman_id
;
*/

-- 3. From the following tables, write a SQL query to find all those salespeople and customers who are involved in the inventory management system. Return salesperson ID, customer ID.
(SELECT salesman_id, customer_id
FROM orders
)
UNION
(SELECT salesman_id, customer_id
FROM customer
)
ORDER BY salesman_id
;

