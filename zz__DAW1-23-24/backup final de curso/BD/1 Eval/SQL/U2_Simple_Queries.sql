/*
Query 1:
Find hospitals with an A as a second character on their name. 
Return its code, name and telephone number.

SELECT CONCAT(HOSPITAL_COD, ' - ', NAME) AS 'Hospital', TELEPHONE AS 'Teléfono'
FROM hospital
WHERE NAME LIKE '_A%'
;


-----------------------
Query 2:
Find employees without a nightshift. Return their employee number, 
surname and the hospital code where they work order by hospital code 
(first and ascendent) and surname (second and descendent).

SELECT EMPLOYEE_NO AS 'Número empleado', SURNAME AS 'Empleado', HOSPITAL_COD AS 'Código hospital'
FROM staff
WHERE SHIFT != 'N'
ORDER BY (HOSPITAL_COD), (SURNAME) DESC
;


-----------------------
Query 3
Find all staff members with salaries between 2,000,000 and 3,000,000 who are nurses. 
Return employee number, surname and salary.

SELECT EMPLOYEE_NO AS 'Número empleado', SURNAME AS 'Empleado', SALARY AS 'Salario'
FROM staff
WHERE SALARY BETWEEN '2000000' AND '3000000'
AND ROLE = 'NURSE'
;


-----------------------
Query 4
Find all gynecology and urology specialty doctors. Return their doctor number, surname, 
specialty and the hospital code where they work.

SELECT DOCTOR_NO AS 'Número colegiado', SURNAME AS 'Doctor', SPECIALTY AS 'Especialidad',
HOSPITAL_COD AS 'Código hospital'
FROM doctor
WHERE SPECIALTY LIKE 'Urology' OR SPECIALTY LIKE 'Gynecology'
;


-----------------------
Query 5
Find how many different doctor specialties are stored in the database

SELECT COUNT(DISTINCT SPECIALTY) AS 'Cantidad especialidades'
FROM doctor
;
*/


