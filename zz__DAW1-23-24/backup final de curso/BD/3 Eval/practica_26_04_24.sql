create database if not exists practica_26_04_24;

use practica_26_04_24;

/*DROPS*/
drop table if exists articulos;
drop table if exists fabricantes;
drop table if exists empleados;
drop table if exists departamentos;
drop table if exists cajas;
drop table if exists almacenes;
drop table if exists salas;
drop table if exists peliculas;
drop table if exists suministra;
drop table if exists piezas;
drop table if exists proveedores;
drop table if exists asignado_a;
drop table if exists cientificos;
drop table if exists proyecto;
drop table if exists venta;
drop table if exists cajeros;
drop table if exists productos;
drop table if exists maquinas_registradoras;
drop table if exists reserva;
drop table if exists equipos;
drop table if exists investigadores;
drop table if exists facultad;

/*TABLES*/
create table if not exists fabricantes(
codigo int auto_increment primary key,
    nombre varchar(100)
);

create table if not exists articulos(
	codigo int auto_increment primary key,
    nombre varchar(100),
    precio int,
    fabricante int,
    constraint fk_fabricantes foreign key(fabricante) references fabricantes (codigo)
);

create table if not exists departamentos(
	codigo int auto_increment primary key,
    nombre varchar(100),
    presupuesto int
);

create table if not exists empleados(
	dni varchar(8) primary key,
    nombre varchar(100),
    apellidos varchar(255),
    departamento int,
    constraint fk_departamentos foreign key (departamento) references departamentos (codigo)
);

create table if not exists almacenes(
	codigo int auto_increment primary key,
    lugar varchar(100),
    capacidad int
);

create table if not exists cajas(
	numReferencia char(5) primary key,
    contenido varchar(100),
    valor int,
    almacen int,
    constraint fk_almacenes foreign key (almacen) references almacenes (codigo)
);

create table if not exists peliculas(
	codigo int auto_increment primary key,
    nombre varchar(100),
    calificacionEdad int
);

create table if not exists salas(
	codigo int auto_increment primary key,
    nombre varchar(100),
    pelicula int,
    constraint fk_peliculas foreign key (pelicula) references peliculas (codigo)
);

create table if not exists piezas(
	codigo int auto_increment primary key,
    nombre varchar(100)
);

create table if not exists proveedores(
	id char(4) primary key,
    nombre varchar(100)
);

create table if not exists suministra(
	codigoPieza int,
    idProveedor char(4),
    precio int,
    primary key (codigoPieza, idProveedor),
    constraint fk_piezas foreign key (codigoPieza) references piezas (codigo),
    constraint fk_proveedores foreign key (idProveedor) references proveedores (id)
);

create table if not exists cientificos(
	dni varchar(8) primary key,
    nomApels varchar(255)
);

create table if not exists proyecto(
	id char(4) primary key,
    nombre varchar(100)
);

create table if not exists asignado_a(
	cientifico varchar(8),
    proyecto char(4),
    primary key (cientifico, proyecto),
    constraint fk_cientifico foreign key (cientifico) references cientificos (dni),
    constraint fk_proyecto foreign key (proyecto) references proyecto (id)
);

create table if not exists cajeros(
	codigo int auto_increment primary key,
    nomApels varchar(255)
);

create table if not exists productos(
	codigo int auto_increment primary key,
    nombre varchar(100),
    precio int
);

create table if not exists maquinas_registradoras(
	codigo int auto_increment primary key,
    piso int
);

create table if not exists venta(
	cajero int,
    maquina int,
    producto int,
    primary key(cajero, maquina, producto),
    constraint fk_cajero foreign key(cajero) references cajeros(codigo),
    constraint fk_maquina foreign key(maquina) references maquinas_registradoras(codigo),
    constraint fk_productos foreign key(producto) references productos(codigo)
);

create table if not exists facultad(
	codigo int auto_increment primary key,
    nombre varchar(100)
);

create table if not exists investigadores(
	dni varchar(8) primary key,
    nomApels varchar(255),
    facultad int,
    constraint fk_facultad foreign key(facultad) references facultad(codigo)
);

create table if not exists equipos(
	numSerie char(4) primary key,
    nombre varchar(100),
    facultad int,
    constraint fk_facultad_equipos foreign key(facultad) references facultad(codigo)
);

create table if not exists reserva(
	dni varchar(8),
    numSerie char(4),
    comienzo datetime,
    fin datetime,
    primary key(dni, numSerie),
    constraint fk_investigadores foreign key(dni) references investigadores(dni),
    constraint fk_equipos foreign key(numSerie) references equipos(numSerie)
);

/*INSERTS*/
insert into fabricantes(nombre)values
	('Zara'),
    ('Springfield');
   
insert into articulos(nombre, precio, fabricante)values
	('Camisa', '30', '1'),
    ('Pantalón', '40', '2');
   
insert into departamentos(nombre, presupuesto)values
	('Hombre', '30000'),
    ('Mujer', '40000');
   
insert into empleados(dni, nombre, apellidos, departamento)values
	('20202020', 'Ramon', 'Riera', '1'),
    ('30303030', 'Fabricio', 'Fernández', '1'),
    ('30303031', 'Amparo', 'Gómez', '2'),
    ('30303032', 'María', 'Auxiliadora', '2');

insert into almacenes(lugar, capacidad)values
	('Alicante', '250'),
    ('Murcia', '180');
   
insert into cajas(numReferencia, contenido, valor, almacen)values
	('12', 'Chaquetas', 4000, 1),
    ('14', 'Bufandas', 300, 2);
    
   
insert into facultad(nombre)values
	('UOIB'),
	('Universidad Miguel Hernández');

insert into investigadores(dni, nomApels, Facultad)values
	('12341234', 'Antonio Hover', 1),
	('43214321', 'Miguel Ferran', 2);

insert into equipos(numSerie, nombre, facultad)values
	('1', 'Física', 1),
	('2', 'Química', 2);

insert into reserva(dni, numSerie, comienzo, fin)values
	('12341234', 1, '2022-03-030', '2022-03-06'),
	('43214321', 2,'2023-08-23', '2023-09-22');

/*SELECTS*/
select * from investigadores;

/*Para ver qué tipo de caracteres hay disponibles:*/
show character set;