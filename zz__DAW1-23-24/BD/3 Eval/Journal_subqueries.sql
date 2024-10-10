USE library;

SELECT *
FROM AUTHOR;

SELECT B.TITLE, A.NAME
FROM BOOK B, AUTHOR A
WHERE B.AUTHOR_CODE = A.AUTHOR_CODE;

USE Sales;

/*1*/
SELECT *
FROM orders
WHERE salesman_id = (
	SELECT salesman_id
    FROM salesman
    WHERE name = 'Paul Aadam');
    
/*2*/
SELECT *
FROM orders
WHERE salesman_id = (
	SELECT salesman_id
    FROM salesman
    WHERE city = 'London');
    
/*3*/
SELECT *
FROM orders 
WHERE salesman_id IN (
	SELECT salesman_id
    FROM salesman
    WHERE customer_id = 3007);

/*4*/
SELECT *
FROM orders
WHERE purch_amt > (
	SELECT AVG(purch_amt)
    FROM orders
    WHERE ord_date = 2012-10-10);
    
/*5*/
SELECT *
FROM orders
WHERE salesman_id IN (
	SELECT salesman_id
    FROM salesman
    WHERE city = 'New York');

/*6*/
SELECT comission
FROM salesman
WHERE salesman_id IN (
	SELECT salesman_id
    FROM customer
    WHERE city = 'Paris');
    
/*15 - From the following tables, write a SQL query to find those employees who earn more 
than the average salary and work in the same department as an employee whose first name 
contains the letter 'J'. Return employee ID, first name and salary.*/
SELECT FIRST_NAME,
    
