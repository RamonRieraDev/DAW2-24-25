use classicmodels;
/*1- Obtén, de todos los EMPLOYEES que NO tienen CUSTOMERS asignados los siguientes datos :*/
select e.employeeNumber, concat(e.firstName, ' ', e.lastName) as NombreEmpleado,
concat(c.contactFirstName, ' ', c.contactLastName) as NombreCliente
from employees e
left join customers c on c.salesRepEmployeeNumber = e.employeeNumber
where c.customerNumber is null;

/*2 - Obtén, de todos los CUSTOMERS los siguientes datos :*/
select c.customerNumber, concat(c.contactFirstName, ' ', c.contactLastName) as NombreCliente,
concat(e.firstName, ' ', e.lastName) as NombreEmpleado
from customers c
left join employees e on c.salesRepEmployeeNumber = e.employeeNumber
where e.employeeNumber is not null;

select e.employeeNumber, 
concat(e.firstName, ' ', e.lastName) as NombreEmpleado,
'Empleado' as TablaOrigen
from employees e
union
select c.customerNumber,  
concat(c.contactFirstName, ' ', c.contactLastName) as NombreCliente,
'Cliente'
from customers c;

/*4*/
select concat(e.firstName, ' ', e.lastName) as NombreEmpleado,
concat(c.contactFirstName, ' ', c.contactLastName) as NombreCliente
from employees e 
join customers c on c.salesRepEmployeeNumber = e.employeeNumber
group by c.customerNumber
having (select count(c2.customerNumber) from customers c2) > 7;
/*
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
*/

/*5*/
select c.customerName,
p.checkNumber,
p.amount
from customers c
join payments p using(customerNumber)
where p.amount > (
select avg(p2.amount)
from payments p2);

/*6*/
select e.lastName as 'Apellidos'
from employees e
left join customers c on c.salesRepEmployeeNumber = e.employeeNumber
where e.lastName = c.contactLastName
union 
select c2.contactLastName
from customers c2
left join employees e2 on c2.salesRepEmployeeNumber = e2.employeeNumber
where e2.lastName = c2.contactLastName;

select e.lastName as 'Apellidos'
from employees e
INTERSECT
select c2.contactLastName
from customers c2
;

select avg(amount) from payments;
select * from employees;
select * from customers;
select * from offices;
select * from payments;
select * from orders;
select * from orderdetails;
