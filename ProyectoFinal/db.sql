DROP DATABASE IF EXISTS empleados;
CREATE DATABASE empleados;
USE empleados;

CREATE TABLE genero(
	id int auto_increment key,
    nombre varchar(20) not null
    
);

CREATE TABLE empleados(
	id int auto_increment key,
    nombre varchar(100) not null,
	domicilio varchar(100) not null,
    telefono  varchar(12) not null,
    email varchar(100) not null,
    fecha_nacimiento date,
    id_genero int
);

CREATE TABLE login(
	id int auto_increment key,
    nombre varchar(100) not null,
    email varchar(100) not null,
    usuario varchar(100) not null,
    contrasenia varchar (100) not null
    
);
INSERT INTO genero VALUES  
    (null,'Femenino'),
    (null,'Masculino');

-- Insertamos los registro en la tabla empleados
INSERT INTO empleados 
VALUES
(null,'Pikachu','casa de Ash','551233004422', 'pikachuloko@gmail.com', '1996-07-11',1),
(null,'Slowpoke','casa de Ash','007933554412', 'Slowpokeloko@gmail.com', '1996-07-18',2),
(null,'Bulbasaur','casa de Ash','821335404421', 'Bulbasaurloko@gmail.com', '1996-07-12',2),
(null,'Charmander','casa de Ash','661233184275', 'Charmanderloko@gmail.com', '1996-07-13',2),
(null,'Squirtle','casa de Ash','000734104482', 'Squirtle@gmail.com', '1996-07-14',1),
(null,'Caterpie','casa de Ash','001053006427', 'Caterpieko@gmail.com', '1996-07-15',2),
(null,'Clefairy','casa de Ash','003587024452', 'Clefairy@gmail.com', '1996-07-16',1),
(null,'Vulpix','casa de Ash','003731104435', 'Vulpixo@gmail.com', '1996-07-17',1),
(null,'Jigglypuff','casa de Ash','003988004428', 'Jigglypuff@gmail.com', '1996-07-18',1),
(null,'Zubat','casa de Ash','004173004222', 'Zubatloko@gmail.com', '1996-07-19',1),
(null,'Oddish','casa de Ash','004333005621', 'Oddishloko@gmail.com', '1996-07-11',1),
(null,'Psyduck','casa de Ash','005488916943', 'Psyduckloko@gmail.com', '1996-07-11',2);


    
    