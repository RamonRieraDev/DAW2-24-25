CREATE DATABASE IF NOT EXISTS EXPERIMENTS_DB;

use EXPERIMENTS_DB;

drop table if exists contacts;
CREATE TABLE contacts(
	id int auto_increment primary key,
    name varchar(255) not null,
    email varchar(320) not null
);

DROP TABLE IF EXISTS tasks;
CREATE TABLE tasks (
  task_id INT AUTO_INCREMENT PRIMARY KEY, 
  title VARCHAR(255) NOT NULL, 
  start_date DATE, 
  due_date DATE, 
  priority TINYINT NOT NULL DEFAULT 3, 
  description TEXT
);

insert into contacts(name, email)
values
	('Ramon Riera', 'info@ramonriera.es'),
	('John Doe', 'john.doe@mysqltutorial.org'),
	('Jane Doe', 'jane.doe@mysqltutorial.org');
    
INSERT INTO tasks(title, priority) 
VALUES
	('Learn MySQL INSERT Statement', 1),
	('Understanding DEFAULT keyword', DEFAULT);
    
INSERT INTO tasks(title, start_date, due_date) 
VALUES ('Insert date into table', '2018-01-09', '2018-09-15');

select * from tasks
where month(start_date) = 1;
    