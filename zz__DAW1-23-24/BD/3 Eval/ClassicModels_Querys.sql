USE CLASSICMODELS;

/* Encontrar el empleado que tiene el mayor número de subordinados directos:*/
SELECT E.EMPLOYEENUMBER AS CODE, CONCAT(E.FIRSTNAME, ' ', E.LASTNAME) AS EMPLOYEE,
COUNT(E.EMPLOYEENUMBER) AS 'REPORTS TO'
FROM EMPLOYEES E LEFT JOIN EMPLOYEES E2 ON E.EMPLOYEENUMBER = E2.REPORTSTO
GROUP BY E.EMPLOYEENUMBER
ORDER BY 3 DESC
;

/* Calcular el total de pagos realizados por cada cliente:*/
SELECT CUSTOMERNUMBER, COUNT(CUSTOMERNUMBER)
FROM ORDERS
GROUP BY CUSTOMERNUMBER;
--
select concat(e.firstName, ' ', e.lastName) as NombreEmpleado,
concat(c.contactFirstName, ' ', c.contactLastName) as NombreCliente
from employees e 
join customers c on c.salesRepEmployeeNumber = e.employeeNumber
where count(c.customerNumber) > 7
group by c.employeesNumber;

select concat(e.firstName, ' ', e.lastName) as NombreEmpleado,
concat(c.contactFirstName, ' ', c.contactLastName) as NombreCliente
from employees e, customers c
where count(c.customerNumber) > 7
group by c.customerNumber;
--
SELECT CUSTOMERNUMBER AS 'CUSTOMER CODE', SUM(AMOUNT) AS 'TOTAL AMOUNT'
FROM PAYMENTS
GROUP BY CUSTOMERNUMBER;

/*Mostrar el nombre del cliente, la fecha de la orden y el estado de todas las órdenes 
realizadas por clientes que tengan un límite de crédito superior a 100000:*/
SELECT C.CUSTOMERNAME, O.ORDERDATE, O.STATUS, C.CREDITLIMIT
FROM CUSTOMERS C JOIN ORDERS O USING(CUSTOMERNUMBER)
WHERE CREDITLIMIT > 10000
ORDER BY C.CREDITLIMIT
;

/* Listar todas las líneas de productos junto con la cantidad total de productos en 
cada línea:*/
SELECT P.PRODUCTLINE, SUM(P2.QUANTITYINSTOCK)
FROM PRODUCTS P JOIN PRODUCTS P2 USING (PRODUCTLINE)
GROUP BY PRODUCTLINE;

/* Encontrar el nombre y el correo electrónico de los empleados que trabajan en la 
oficina con el código '4':*/
SELECT CONCAT(E.FIRSTNAME, ' ', E.LASTNAME) AS EMPLOYEE, E.EMAIL, OFFICECODE
FROM EMPLOYEES E
WHERE OFFICECODE = 4;
;

/* Calcular el total de pagos realizados en cada mes durante el año 2023:*/
SELECT SUM(AMOUNT) AS 'TOTAL AMOUNT'
FROM PAYMENTS
WHERE YEAR(PAYMENTDATE) = 2005;

/* Encontrar los clientes que han realizado órdenes durante el mes de enero de 2024:*/
SELECT O.CUSTOMERNUMBER, C.CUSTOMERNAME, O.ORDERDATE
FROM ORDERS O JOIN CUSTOMERS C USING(CUSTOMERNUMBER)
WHERE O.ORDERDATE IN (
SELECT O2.ORDERDATE
FROM ORDERS O2
WHERE MONTH(O2.ORDERDATE) = 1 AND (YEAR(O2.ORDERDATE) = 2004) AND DAY(O2.ORDERDATE) = 2);

/* Mostrar el nombre del producto, la cantidad pedida y el precio de venta para todos 
los productos en la orden número 10101:*/
SELECT P.PRODUCTNAME, OD.QUANTITYORDERED, OD.PRICEEACH
FROM PRODUCTS P JOIN ORDERDETAILS OD USING(PRODUCTCODE)
WHERE OD.ORDERNUMBER = 10101;

/* Encontrar el empleado que ha registrado la mayor cantidad de órdenes:*/
SELECT E.EMPLOYEENUMBER, CONCAT(E.FIRSTNAME, ' ', E.LASTNAME) AS EMPLOYEE, 
COUNT(O.ORDERNUMBER) AS 'QUANTITY ORDERS'
FROM EMPLOYEES E 
JOIN CUSTOMERS C ON E.EMPLOYEENUMBER = C.salesRepEmployeeNumber
JOIN ORDERS O USING (CUSTOMERNUMBER)
GROUP BY E.EMPLOYEENUMBER
;


/* Calcular el total de ventas (cantidad * precio) para cada línea de productos:*/
SELECT PL.PRODUCTLINE, SUM(OD.QUANTITYORDERED * OD.PRICEEACH) AS TOTAL
FROM PRODUCTLINES PL 
JOIN PRODUCTS P USING(PRODUCTLINE)
JOIN ORDERDETAILS OD USING(PRODUCTCODE)
GROUP BY P.PRODUCTLINE;

/* Encontrar los clientes que no han realizado ningún pago:*/
SELECT C.CUSTOMERNAME
FROM CUSTOMERS C JOIN PAYMENTS P USING(CUSTOMERNUMBER)
WHERE P.AMOUNT = 0;

/* Encontrar los clientes que tienen un límite de crédito superior al promedio de todos los 
clientes:*/
SELECT C.CUSTOMERNAME, C.CREDITLIMIT
FROM CUSTOMERS C
WHERE C.CREDITLIMIT > (
SELECT AVG(C2.CREDITLIMIT)
FROM CUSTOMERS C2)
;

/* Mostrar el nombre y el cargo de los empleados que no tienen un supervisor:*/
SELECT CONCAT(FIRSTNAME, ' ', LASTNAME) AS EMPLOYEE, JOBTITLE
FROM EMPLOYEES
WHERE REPORTSTO IS NULL;

/* Calcular el promedio de la cantidad de productos en stock para cada línea de productos:*/
SELECT P.PRODUCTLINE AS 'LINEA DE PRODUCTO', AVG(P.QUANTITYINSTOCK) AS PROMEDIO
FROM PRODUCTS P JOIN PRODUCTLINES PL USING(PRODUCTLINE)
GROUP BY PL.PRODUCTLINE;

/* Encontrar los productos que se han pedido menos de 10 veces:*/
SELECT P.PRODUCTCODE, P.PRODUCTNAME
FROM PRODUCTS P LEFT JOIN ORDERDETAILS OD USING(PRODUCTCODE)
GROUP BY P.PRODUCTCODE
HAVING COUNT(OD.PRODUCTCODE) < 10;

/* Listar todas las oficinas junto con el número total de empleados en cada una:*/
SELECT O.OFFICECODE, O.CITY, COUNT(E.EMPLOYEENUMBER) AS 'TOTAL EMPLOYEES'
FROM OFFICES O JOIN EMPLOYEES E USING(OFFICECODE)
GROUP BY O.OFFICECODE;

/* Encontrar el cliente que ha realizado el pedido más reciente:*/
SELECT C.CUSTOMERNUMBER AS CODE, C.CUSTOMERNAME AS NAME, O.ORDERDATE
FROM CUSTOMERS C JOIN ORDERS O USING(CUSTOMERNUMBER)
ORDER BY ORDERDATE DESC
LIMIT 1;

/* Mostrar el nombre del producto y el precio de venta para los productos con precio de 
compra superior a 100:*/
SELECT PRODUCTNAME, MSRP
FROM PRODUCTS
WHERE BUYPRICE > 100;

/* Calcular el total de pagos realizados por cada país (usando información de la tabla offices):*/
SELECT O.COUNTRY, SUM(P.AMOUNT)
FROM OFFICES O 
JOIN EMPLOYEES E USING (OFFICECODE)
JOIN CUSTOMERS C ON C.SALESREPEMPLOYEENUMBER = E.EMPLOYEENUMBER
JOIN PAYMENTS P USING (CUSTOMERNUMBER)
GROUP BY O.COUNTRY;

/* Encontrar los empleados que no tienen clientes asignados (no aparecen en la tabla customers):*/
SELECT E.EMPLOYEENUMBER, CONCAT(E.FIRSTNAME, ' ', E.LASTNAME), C.CUSTOMERNUMBER
FROM EMPLOYEES E 
LEFT JOIN CUSTOMERS C ON C.SALESREPEMPLOYEENUMBER = E.EMPLOYEENUMBER
WHERE C.CUSTOMERNUMBER IS NULL;

/* Mostrar el nombre del producto y la cantidad pedida para todos los productos en la orden 
número 10102:*/
SELECT P.PRODUCTNAME, OD.QUANTITYORDERED
FROM PRODUCTS P 
JOIN ORDERDETAILS OD USING (PRODUCTCODE)
WHERE ORDERNUMBER = 10102;

/* Encontrar los clientes que tienen un límite de crédito superior al promedio de todos los clientes,
 junto con el nombre y la ciudad de la oficina donde trabaja su representante de ventas:*/
SELECT C.CUSTOMERNUMBER, C.CUSTOMERNAME, C.CREDITLIMIT, O.OFFICECODE, O.CITY
FROM CUSTOMERS C
JOIN EMPLOYEES E ON E.EMPLOYEENUMBER = C.SALESREPEMPLOYEENUMBER
JOIN OFFICES O USING (OFFICECODE)
WHERE C.CREDITLIMIT > (
SELECT AVG(C2.CREDITLIMIT)
FROM CUSTOMERS C2);

/*Mostrar el nombre y el cargo de todos los empleados, así como el nombre y la ciudad de la oficina 
donde trabajan, ordenados por el nombre de la ciudad de la oficina de manera ascendente:*/
SELECT E.FIRSTNAME, E.JOBTITLE, O.OFFICECODE, O.CITY
FROM EMPLOYEES E
LEFT JOIN OFFICES O USING(OFFICECODE)
ORDER BY O.CITY;

/*Listar todas las líneas de productos y las líneas de productos que tienen al menos un producto 
asociado, ordenadas alfabéticamente por el nombre de la línea de productos:*/
SELECT PL.PRODUCTLINE
FROM PRODUCTLINES PL
UNION
SELECT P.PRODUCTLINE
FROM PRODUCTS P
ORDER BY PRODUCTLINE;

/* */

SELECT pl.productLine
FROM productlines pl
UNION
SELECT DISTINCT p.productLine
FROM products p
ORDER BY productLine ASC;

SELECT * FROM OFFICES;
SELECT * FROM ORDERS;
SELECT * FROM ORDERDETAILS;
SELECT * FROM CUSTOMERS;
SELECT * FROM EMPLOYEES;
SELECT * FROM PAYMENTS;
SELECT * FROM PRODUCTS;
SELECT * FROM PRODUCTLINES;



/* 
Listar todas las líneas de productos:
sql
Copy code
SELECT * FROM productlines;
Encontrar los productos de una línea de productos específica (por ejemplo, "Cars"):
sql
Copy code
SELECT * FROM products WHERE productLine = 'Cars';
Mostrar el nombre y la extensión de todos los empleados:
sql
Copy code
SELECT firstName, lastName, extension FROM employees;
Obtener la lista de clientes y su límite de crédito:
sql
Copy code
SELECT customerName, creditLimit FROM customers;
Encontrar todas las órdenes realizadas por un cliente específico (por ejemplo, cliente número 103):
sql
Copy code
SELECT * FROM orders WHERE customerNumber = 103;
Calcular el total de ventas (cantidad * precio) para cada producto en una orden específica (por ejemplo, orden número 10100):
sql
Copy code
SELECT od.productCode, od.quantityOrdered * od.priceEach AS totalVenta
FROM orderdetails od
WHERE od.orderNumber = 10100;
Mostrar todas las oficinas ubicadas en un país específico (por ejemplo, USA):
sql
Copy code
SELECT * FROM offices WHERE country = 'USA';
Encontrar el empleado que tiene el mayor número de subordinados directos:
sql
Copy code
SELECT e1.employeeNumber, e1.firstName, e1.lastName, COUNT(e2.employeeNumber) AS numSubordinados
FROM employees e1
LEFT JOIN employees e2 ON e1.employeeNumber = e2.reportsTo
GROUP BY e1.employeeNumber
ORDER BY numSubordinados DESC
LIMIT 1;
Calcular el total de pagos realizados por cada cliente:
sql
Copy code
SELECT p.customerNumber, SUM(p.amount) AS totalPagos
FROM payments p
GROUP BY p.customerNumber;
Encontrar los productos que tienen un precio de compra mayor al precio de venta (es decir, aquellos con pérdida potencial):
sql
Copy code
SELECT * FROM products WHERE buyPrice > MSRP;
Encontrar el nombre del producto y la cantidad disponible en stock para todos los productos:
sql
Copy code
SELECT productName, quantityInStock FROM products;
Mostrar el nombre del cliente, la fecha de la orden y el estado de todas las órdenes realizadas por clientes que tengan un límite de crédito superior a 100000:
sql
Copy code
SELECT c.customerName, o.orderDate, o.status
FROM customers c
JOIN orders o ON c.customerNumber = o.customerNumber
WHERE c.creditLimit > 100000;
Listar todas las líneas de productos junto con la cantidad total de productos en cada línea:
sql
Copy code
SELECT pl.productLine, COUNT(p.productCode) AS cantidadProductos
FROM productlines pl
LEFT JOIN products p ON pl.productLine = p.productLine
GROUP BY pl.productLine;
Encontrar el nombre y el correo electrónico de los empleados que trabajan en la oficina con el código '4':
sql
Copy code
SELECT e.firstName, e.lastName, e.email
FROM employees e
JOIN offices o ON e.officeCode = o.officeCode
WHERE o.officeCode = '4';
Calcular el total de pagos realizados en cada mes durante el año 2023:
sql
Copy code
SELECT MONTH(paymentDate) AS mes, YEAR(paymentDate) AS año, SUM(amount) AS totalPagos
FROM payments
WHERE YEAR(paymentDate) = 2023
GROUP BY MONTH(paymentDate), YEAR(paymentDate);
Encontrar los clientes que han realizado órdenes durante el mes de enero de 2024:
sql
Copy code
SELECT DISTINCT c.customerName
FROM customers c
JOIN orders o ON c.customerNumber = o.customerNumber
WHERE YEAR(o.orderDate) = 2024 AND MONTH(o.orderDate) = 1;
Mostrar el nombre del producto, la cantidad pedida y el precio de venta para todos los productos en la orden número 10101:
sql
Copy code
SELECT p.productName, od.quantityOrdered, od.priceEach
FROM products p
JOIN orderdetails od ON p.productCode = od.productCode
WHERE od.orderNumber = 10101;
Encontrar el empleado que ha registrado la mayor cantidad de órdenes:
sql
Copy code
SELECT e.firstName, e.lastName, COUNT(o.orderNumber) AS numOrdenes
FROM employees e
JOIN orders o ON e.employeeNumber = o.salesRepEmployeeNumber
GROUP BY e.employeeNumber
ORDER BY numOrdenes DESC
LIMIT 1;
Calcular el total de ventas (cantidad * precio) para cada línea de productos:
sql
Copy code
SELECT pl.productLine, SUM(od.quantityOrdered * od.priceEach) AS totalVentas
FROM productlines pl
JOIN products p ON pl.productLine = p.productLine
JOIN orderdetails od ON p.productCode = od.productCode
GROUP BY pl.productLine;
Encontrar los clientes que no han realizado ningún pago:
sql
Copy code
SELECT c.customerName
FROM customers c
LEFT JOIN payments p ON c.customerNumber = p.customerNumber
WHERE p.customerNumber IS NULL;
Encontrar los clientes que tienen un límite de crédito superior al promedio de todos los clientes:
sql
Copy code
SELECT customerName, creditLimit
FROM customers
WHERE creditLimit > (SELECT AVG(creditLimit) FROM customers);
Mostrar el nombre y el cargo de los empleados que no tienen un supervisor:
sql
Copy code
SELECT firstName, lastName, jobTitle
FROM employees
WHERE reportsTo IS NULL;
Calcular el promedio de la cantidad de productos en stock para cada línea de productos:
sql
Copy code
SELECT productLine, AVG(quantityInStock) AS promedioStock
FROM products
GROUP BY productLine;
Encontrar los productos que se han pedido menos de 10 veces:
sql
Copy code
SELECT productName, COUNT(od.orderNumber) AS numPedidos
FROM products p
LEFT JOIN orderdetails od ON p.productCode = od.productCode
GROUP BY p.productCode
HAVING numPedidos < 10;
Listar todas las oficinas junto con el número total de empleados en cada una:
sql
Copy code
SELECT o.officeCode, o.city, COUNT(e.employeeNumber) AS numEmpleados
FROM offices o
LEFT JOIN employees e ON o.officeCode = e.officeCode
GROUP BY o.officeCode;
Encontrar el cliente que ha realizado el pedido más reciente:
sql
Copy code
SELECT c.customerName, o.orderDate
FROM customers c
JOIN orders o ON c.customerNumber = o.customerNumber
ORDER BY o.orderDate DESC
LIMIT 1;
Mostrar el nombre del producto y el precio de venta para los productos con precio de compra superior a 1000:
sql
Copy code
SELECT productName, MSRP
FROM products
WHERE buyPrice > 1000;
Calcular el total de pagos realizados por cada país (usando información de la tabla offices):
sql
Copy code
SELECT o.country, SUM(p.amount) AS totalPagos
FROM offices o
LEFT JOIN employees e ON o.officeCode = e.officeCode
LEFT JOIN customers c ON e.employeeNumber = c.salesRepEmployeeNumber
LEFT JOIN payments p ON c.customerNumber = p.customerNumber
GROUP BY o.country;
Encontrar los empleados que no tienen clientes asignados (no aparecen en la tabla customers):
sql
Copy code
SELECT e.firstName, e.lastName
FROM employees e
LEFT JOIN customers c ON e.employeeNumber = c.salesRepEmployeeNumber
WHERE c.customerNumber IS NULL;
Mostrar el nombre del producto y la cantidad pedida para todos los productos en la orden número 10102:
sql
Copy code
SELECT p.productName, od.quantityOrdered
FROM products p
JOIN orderdetails od ON p.productCode = od.productCode
WHERE od.orderNumber = 10102;
Encontrar los clientes que tienen un límite de crédito superior al promedio de todos los clientes, junto con el nombre y la ciudad de la oficina donde trabaja su representante de ventas:
sql
Copy code
SELECT c.customerName, c.creditLimit, o.city
FROM customers c
JOIN employees e ON c.salesRepEmployeeNumber = e.employeeNumber
JOIN offices o ON e.officeCode = o.officeCode
WHERE c.creditLimit > (SELECT AVG(creditLimit) FROM customers);
Mostrar el nombre y el cargo de todos los empleados, así como el nombre y la ciudad de la oficina donde trabajan, ordenados por el nombre de la ciudad de la oficina de manera ascendente:
sql
Copy code
SELECT e.firstName, e.lastName, e.jobTitle, o.city
FROM employees e
JOIN offices o ON e.officeCode = o.officeCode
ORDER BY o.city ASC;
Listar todas las líneas de productos y las líneas de productos que tienen al menos un producto asociado, ordenadas alfabéticamente por el nombre de la línea de productos:
sql
Copy code
SELECT pl.productLine
FROM productlines pl
UNION
SELECT DISTINCT p.productLine
FROM products p
ORDER BY productLine ASC;
Encontrar el nombre del cliente y el total de pagos realizados por cada cliente, mostrando incluso si el total de pagos es cero, junto con el nombre y la ciudad de la oficina donde trabaja su representante de ventas (incluso si el cliente no tiene asignado un representante de ventas):
sql
Copy code
SELECT c.customerName, COALESCE(SUM(p.amount), 0) AS totalPagos, e.firstName, e.lastName, o.city
FROM customers c
LEFT JOIN payments p ON c.customerNumber = p.customerNumber
LEFT JOIN employees e ON c.salesRepEmployeeNumber = e.employeeNumber
LEFT JOIN offices o ON e.officeCode = o.officeCode
GROUP BY c.customerNumber;
Mostrar el nombre del producto y la cantidad pedida para todos los productos en la orden número 10100, así como el nombre del cliente que realizó la orden:
sql
Copy code
SELECT p.productName, od.quantityOrdered, c.customerName
FROM products p
JOIN orderdetails od ON p.productCode = od.productCode
JOIN orders o ON od.orderNumber = o.orderNumber
JOIN customers c ON o.customerNumber = c.customerNumber
WHERE o.orderNumber = 10100;
Encontrar los productos que se han pedido menos de 10 veces, mostrando el nombre del producto y la cantidad total pedida para cada producto, junto con el nombre de la línea de productos a la que pertenece cada producto:
sql
Copy code
SELECT p.productName, SUM(od.quantityOrdered) AS totalPedidos, p.productLine
FROM products p
LEFT JOIN orderdetails od ON p.productCode = od.productCode
GROUP BY p.productCode
HAVING totalPedidos < 10;
Listar los nombres de los empleados que tienen clientes asignados, ordenados alfabéticamente por el apellido del empleado, y mostrar el número de clientes asignados a cada empleado:
sql
Copy code
SELECT e.lastName, e.firstName, COUNT(c.customerNumber) AS numClientes
FROM employees e
LEFT JOIN customers c ON e.employeeNumber = c.salesRepEmployeeNumber
GROUP BY e.employeeNumber
HAVING numClientes > 0
ORDER BY e.lastName ASC;
Calcular el total de ventas (cantidad * precio) para cada producto, mostrando el nombre del producto y el total de ventas, ordenados de mayor a menor total de ventas:
sql
Copy code
SELECT p.productName, SUM(od.quantityOrdered * od.priceEach) AS totalVentas
FROM products p
JOIN orderdetails od ON p.productCode = od.productCode
GROUP BY p.productCode
ORDER BY totalVentas DESC;
Encontrar los clientes que no tienen asignado un representante de ventas, mostrando el nombre del cliente, la ciudad del cliente y el país del cliente:
sql
Copy code
SELECT c.customerName, c.city, c.country
FROM customers c
LEFT JOIN employees e ON c.salesRepEmployeeNumber = e.employeeNumber
WHERE e.employeeNumber IS NULL;
Mostrar el nombre de la línea de productos y la cantidad total de productos en stock para cada línea de productos, junto con el total de productos pedidos en todas las órdenes para cada línea de productos:
sql
Copy code
SELECT p.productLine, SUM(p.quantityInStock) AS totalEnStock, SUM(od.quantityOrdered) AS totalPedidos
FROM products p
LEFT JOIN orderdetails od ON p.productCode = od.productCode
GROUP BY p.productLine;
*/

