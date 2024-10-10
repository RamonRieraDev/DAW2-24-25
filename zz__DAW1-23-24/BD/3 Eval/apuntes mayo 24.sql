use classicmodels;

/*08.05.24
INDEX*/
CREATE INDEX jobTitle 
ON employees(jobTitle);

SELECT 
    employeeNumber, 
    lastName, 
    firstName
FROM
    employees
WHERE
    jobTitle = 'Sales Rep';
    
CREATE INDEX jobTitle 
ON employees(jobTitle);

EXPLAIN SELECT 
    employeeNumber, 
    lastName, 
    firstName
FROM
    employees
WHERE
    jobTitle = 'Sales Rep';
    
SHOW INDEXES FROM employees;

drop index jobTitle on employees;

/*09.05.24
CREATE TABLE ... LIKE*/
create table employees_2 like employees;

select * from employees_2;

drop table employees_3;

create table employees_3 as
select * from employees
limit 0;

select * from employees_3;

show create table employees;

show create table employees_2;

show create table employees_3;

describe employees;

alter table employees_2
add nationality varchar(100);

alter table employees_2
modify nationality varchar(50) not null;

alter table employees_2
modify nationality varchar(50) not null
after firstName;

alter table employees_2
modify column nationality varchar(10)
;

alter table employees_2
change column nationality nat varchar(10);

alter table employees_2
drop column nat;

describe employees_2;

CREATE TABLE parts (
    part_no VARCHAR(18) PRIMARY KEY,
    description VARCHAR(40),
    cost DECIMAL(10,2 ) NOT NULL CHECK (cost >= 0),
    price DECIMAL(10,2) NOT NULL CHECK (price >= 0),
    CONSTRAINT parts_chk_price_gt_cost 
        CHECK(price >= cost)
);

INSERT INTO parts(part_no, description,cost,price) 
VALUES('A-001','Cooler',50,100);

