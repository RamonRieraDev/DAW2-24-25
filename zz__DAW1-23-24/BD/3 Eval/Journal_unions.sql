USE sales;

/*1 - From the following tables, write a SQL query to find all 
salespeople and customers located in the city of London.*/
SELECT salesman_id AS ID, 
name AS NAME,
'salesman' AS KIND
FROM salesman
WHERE city = 'London'
UNION
SELECT customer_id,
cust_name,
'customer'
FROM customer
WHERE city = 'London';

/*2* - From the following tables, write a SQL query to find 
distinct salespeople and their cities. Return salesperson ID and city.*/
SELECT salesman_id AS ID, city AS CITY
FROM customer
UNION
(SELECT salesman_id, city
FROM salesman
ORDER BY salesman_id
)
;

/*3 - From the following tables, write a SQL query to find all those 
salespeople and customers who are involved in the inventory management system. 
Return salesperson ID, customer ID.*/
SELECT salesman_id, customer_id
FROM customer
UNION
(SELECT salesman_id, customer_id
FROM orders
)
;

/*4 - From the following table, write a SQL query to find the salespersons who 
generated the largest and smallest orders on each date. Return salesperson ID, 
name, order no., highest on/lowest on, order date.*/
SELECT s.salesman_id, s.name, o.ord_no, 'highest' AS "highest / lowest", 
o.ord_date
FROM orders o, salesman s 
WHERE o.salesman_id = s.salesman_id
AND o.purch_amt IN (
	SELECT MAX(purch_amt)
    FROM orders o2
    WHERE o.ord_date = o2.ord_date)
UNION
(SELECT o.salesman_id, s.name, o.ord_no, 'lowest', o.ord_date
FROM orders o, salesman s 
WHERE o.salesman_id = s.salesman_id
AND o.purch_amt IN (
	SELECT MIN(purch_amt)
    FROM orders o2
    WHERE o.ord_date = o2.ord_date))
;

/*5 - From the following tables, write a SQL query to find the salespeople 
who generated the largest and smallest orders on each date. Sort the 
result-set on third field. Return salesperson ID, name, order no., 
highest on/lowest on, order date.*/
SELECT S.SALESMAN_ID, S.NAME, O.ORD_NO, 'Highest on', O.ORD_DATE
FROM SALESMAN S JOIN ORDERS O USING (SALESMAN_ID)
WHERE PURCH_AMT IN (
SELECT MIN(PURCH_AMT)
FROM ORDERS O2
WHERE O2.ORD_DATE = O.ORD_DATE)
UNION
SELECT S.SALESMAN_ID, S.NAME, O.ORD_NO, 'Lowest on', O.ORD_DATE
FROM SALESMAN S JOIN ORDERS O USING (SALESMAN_ID)
WHERE PURCH_AMT IN (
SELECT MAX(PURCH_AMT)
FROM ORDERS O2
WHERE O2.ORD_DATE = O.ORD_DATE)
ORDER BY 3;

/*6 - From the following tables, write a SQL query to find those salespeople who live in the 
same city where the customer lives as well as those who do not have customers in their cities 
by indicating 'NO MATCH'. Sort the result set on 2nd column (i.e. name) in descending order. 
Return salesperson ID, name, customer name, commission.*/
SELECT S.SALESMAN_ID, S.NAME, C.CUST_NAME, S.COMMISSION, S.CITY
FROM SALESMAN S JOIN CUSTOMER C 
WHERE S.CITY IN (
SELECT C2.CITY
FROM CUSTOMER C2
WHERE C2.CITY = C.CITY)
ORDER BY 2 DESC;

