DROP DATABASE IF EXISTS empleados;
CREATE DATABASE empleados;
USE empleados;


CREATE TABLE empleados(
	id int auto_increment key,
    nombre varchar(100) not null,
	domicilio varchar(100) not null,
    telefono  varchar(12) not null,
    email varchar(100) not null,
    fecha_nacimiento date,
    id_genero int
);

CREATE TABLE genero(
	id int auto_increment key,
    nombre varchar(20) not null
    
);

-- Insertamos los registro en la tabla empleados
INSERT INTO empleados(nombre, domicilio, telefono, email, fecha_nacimiento) 
VALUES('Pikachu','casa de Ash','5512330044', 'pikachuloko@gmail.com', '1996-07-11');