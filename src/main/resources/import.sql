INSERT INTO persona(dni,apellidos,direccion,email,fecha_nacimiento,nombres,telefono) VALUES("48271153","Guevara","Pasaje 14 de julio","miguel@gmail.com","15-08-1998","miguel","8754132");
INSERT INTO docente(id,dni) VALUES(1,"48271153");

INSERT INTO curso(id,aula,ciclo,fecha_fin,fecha_inicio,nivel,servicio,tipo,docente_id) VALUES(1,"A1","I","12-08-2021","10-08-2021","3","Curso Maquinaria Pesada","TALLER",1); 

INSERT INTO especialidad(id,nombre) VALUES(1,"MAQUINARIA PESADA"); 
INSERT INTO especialidad(id,nombre) VALUES(2,"HIDRAULICOS"); 

INSERT INTO especialidad_docente(docente_id,especialidad_id)VALUES(1,1);