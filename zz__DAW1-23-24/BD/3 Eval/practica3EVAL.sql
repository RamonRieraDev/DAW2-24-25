USE classicmodels;

DROP TABLE IF EXISTS employees2;
DROP TABLE IF EXISTS offices2;
DROP TABLE IF EXISTS customers2;

/*1 - Crea una tabla offices2 en base a offices donde
a. sin los datos de la tabla original
b. con PK e INDEXes de la tabla original
*/
CREATE TABLE offices2
LIKE
offices;

/*2 - Inserta en offices2 todos los datos de la offices original*/
INSERT INTO offices2 
SELECT *
FROM offices;

select * from offices2;

/*3 - Crea una tabla employees2 en base a employees donde 
a. con todos los empleados de la tabla original
b. pero sin ninguna definición
*/
CREATE TABLE employees2
SELECT * 
FROM employees;

/*4 - Añade a esta tabla employees2 la PK*/
ALTER TABLE employees2
ADD PRIMARY KEY (employeeNumber);

/*5 - Añade también las FKs apuntando a 
a. employees2 ; deberá estar puesta como borrado a nulos y actualización en cascada
b. offices2 ; deberá estar puesta como borrado por defecto y actualización en cascada
*/
/*Prueba*/
select * from offices2;
select * from employees2;

ALTER TABLE employees2
ADD FOREIGN KEY(officeCode)
REFERENCES offices2(officeCode)
ON UPDATE CASCADE;

ALTER TABLE employees2
ADD FOREIGN KEY(reportsTo)
REFERENCES employees2(employeeNumber)
ON DELETE SET NULL
ON UPDATE CASCADE;

/*6 - Crea una tabla customers2 desde 0, con sus INDEX, PK (apuntando a employees2, 
no a employees original) y FK; esta tabla, sin embargo, será una simplificación de 
la original, recogiendo únicamente los atributos de:
a. CustomerNumber
b. CustomerName
c. salesRepEmployeeNumber
Nota: fíjale MyISAM como engine
*/
select * from customers;

CREATE TABLE customers2(
	CustomerNumber INTEGER, 
    CustomerName VARCHAR(40), 
    salesRepEmployeeNumber INTEGER,
	PRIMARY KEY (customerNumber),
	FOREIGN KEY (salesRepEmployeeNumber) REFERENCES employees (employeeNumber)
) ENGINE=MYISAM;

/*7 - Inserta en customers2 los datos de estos 3 atributos de todos los customers 
originales*/
INSERT INTO customers2 
SELECT CustomerNumber, CustomerName, salesRepEmployeeNumber
FROM customers;

select * from customers2;

/*8 - Enuncia, en máximo 30 palabras, y con tus propias palabras, en qué consiste 
cada una de las propiedades ACID*/
