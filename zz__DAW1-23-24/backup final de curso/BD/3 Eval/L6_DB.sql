/*Crear una base de datos:*/
CREATE DATABASE IF NOT EXISTS L6;

/*Usar la base de datos:*/
USE L6;

/*Crear una tabla:*/
CREATE TABLE tasks (
    id INT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE
);

/*Mostrar todas las tablas que hay en la base de datos:*/
SHOW TABLES;

/*Crear una tabla con foreign key:*/
CREATE TABLE checklists(
  id INT, 
  task_id INT, 
  title VARCHAR(255) NOT NULL, 
  is_completed BOOLEAN NOT NULL DEFAULT FALSE, 
  PRIMARY KEY (id, task_id), 
  FOREIGN KEY (task_id) 
      REFERENCES tasks (id) 
      ON UPDATE RESTRICT 
      ON DELETE CASCADE
);