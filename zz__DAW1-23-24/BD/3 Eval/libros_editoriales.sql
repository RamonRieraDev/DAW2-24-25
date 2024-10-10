CREATE DATABASE IF NOT EXISTS FKS_EXPERIMENTS;
/*Base de datos para hacer pruebas con Foreign Keys.*/
USE FKS_EXPERIMENTS;
drop table if exists libros;
drop table if exists editoriales;

create table editoriales(
	codigo integer auto_increment  primary key,
	nombre text
);

create table libros(
    codigo INT auto_increment primary key,
    titulo text,
    autor text,
    precio real,
    codigoeditorial INT,
	CONSTRAINT FK_editorial FOREIGN KEY (codigoeditorial) REFERENCES editoriales(codigo) 
	on delete SET NULL 	
    on update cascade
) ENGINE = MyISAM;

insert into editoriales(nombre) values('Emece');
insert into editoriales(nombre) values('Planeta');
insert into editoriales(nombre) values('Siglo XXI');

insert into libros(titulo,autor,codigoeditorial) values('El aleph','Borges',1);
insert into libros(titulo,autor,codigoeditorial) values('Martin Fierro','Jose Hernandez',2);
insert into libros(titulo,autor,codigoeditorial) values('Aprenda PHP','Mario Molina',2);
  
delete from editoriales where codigo = 1;
 
insert into libros (titulo, autor, codigoeditorial, precio)
values('El aleph', 'Borges', 2, 34);
insert into libros (titulo, autor, codigoeditorial, precio)
values('Antología poética', 'Borges', 1, 39.50);
insert into libros (titulo, autor, codigoeditorial, precio)
values('Java en 10 minutos', 'Mario Molina', 1, 50.50);
insert into libros (titulo, autor, codigoeditorial, precio)
values('Alicia en el pais de las maravillas', 'Lewis Carroll', 2, 19.90);
insert into libros (titulo, autor, codigoeditorial, precio)
values('Martin Fierro', 'Jose Hernandez', 2, 25.90);
insert into libros (titulo, autor, codigoeditorial, precio)
values('Martin Fierro', 'Jose Hernandez', 3, 16.80);
  
/*Error porque no tiene columna precio
insert into libros(titulo, autor, codigoeditorial) 
values('JSP basico','Tornado Luis');
*/

/*Error porque hay una FK
update editoriales set codigo = 100 where codigo = 1;
*/

/*Eliminar una fila de editoriales
delete from editoriales where codigo=2; 
*/

show create table libros;
select * from libros;
select * from editoriales;