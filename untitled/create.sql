
DROP TABLE IF EXISTS ODONTOLOGOS;
CREATE TABLE ODONTOLOGOS (ID LONG AUTO_INCREMENT PRIMARY KEY, NUMERODEMATRICULA LONG NOT NULL,  NOMBRE VARCHAR(100) NOT NULL, APELLIDO VARCHAR(100) NOT NULL);

-- para test --
INSERT INTO ODONTOLOGOS (NUMERODEMATRICULA, NOMBRE, APELLIDO) VALUES ( 1265, 'Esteban', 'Gonzalez'), ( 6589, 'Armando', 'Cajas');