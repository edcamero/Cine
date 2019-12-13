INSERT INTO public.usuario(
             documento, nombre, apellido, fechanacimiento, telefono, correo, 
            username, pass)
    VALUES ( 1092343938, 'Enyerson', 'Camero','1989-11-13',3213198063,'blade_liger13@hotmail.com', 
            'enyer', 'enyer');
			

INSERT INTO public.usuario(
            documento, nombre, apellido, fechanacimiento, telefono, correo, 
            username, pass)
    	VALUES ( 1090507394, 'Carlos', 'Fuentes','1997-04-15',3214508016,'cfuentess1997@gmail.com', 
            'caliche', 'caliche');
INSERT INTO public.usuario(
            documento, nombre, apellido, fechanacimiento, telefono, correo, 
            username, pass)
    	VALUES ( 1090507395, 'Dayron', 'Torres','1998-08-01',3214508017,'dayrontorres@gmail.com', 
            'dayron', 'dayron');
  --borrando la tabla cine
  
  
  
  
  
  INSERT INTO cine(
            nombre, direccion, telefono)
    	VALUES ( 'metro', 'c.c ventura plaza 2 piso','5778333');  
    	                                               
INSERT INTO cine(
            nombre, direccion, telefono)
    	VALUES ( 'cinemax', 'c.c unicentro','5772721');

INSERT INTO cine(
            nombre, direccion, telefono)
    	VALUES ( 'corioto', 'c.c jardin plaza','5778877');
		
		
		
--SE ESTAN INSERTANDO LAS PELICULAS
INSERT INTO public.pelicula(
            titulo, duracion, genero, portada)
    	VALUES ( 'duro de matar', '1:00:00', 'accion','cartelera2');
INSERT INTO public.pelicula(
            titulo, duracion, genero, portada)
    	VALUES ( 'Frozen 2', '1:00:00', 'accion','cartelera3');
INSERT INTO public.pelicula(
            titulo, duracion, genero, portada)
    	VALUES ( 'Zombiland 2', '1:00:00', 'comedia','cartelera4');
		



INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 1,'sala 1','normal',40);
INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 1,'sala 2','normal',40);
INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 1,'sala 3','normal',40);


INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 2,'sala 1','normal',40);
INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 2,'sala 2','normal',40);
INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 2,'sala 3','normal',40);
INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 2,'sala 4','3D',40);


INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 3,'sala 1','normal',40);
INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 3,'sala 2','normal',40);
INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 3,'sala 3','normal',40);
INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 3,'sala 4','3D',40);
INSERT INTO public.sala(idcine,nombre,
            descripcion, asientos)
    	VALUES ( 3,'sala 5','3D',40);


INSERT INTO funcion(
            idpelicula, idsala, horainicio,fecha)
    	VALUES ( 1, 1, '17:00', '2019-12-23');
INSERT INTO funcion(
            idpelicula, idsala, horainicio ,fecha)
    	VALUES ( 1, 4, '17:00', '2019-12-23');
INSERT INTO funcion(
            idpelicula, idsala, horainicio ,fecha)
    	VALUES ( 1, 8, '17:00', '2019-12-23');
INSERT INTO funcion(
            idpelicula, idsala, horainicio,fecha)
    	VALUES ( 2, 2, '17:00', '2019-12-23');
INSERT INTO funcion(
            idpelicula, idsala, horainicio ,fecha)
    	VALUES ( 2, 5, '17:00', '2019-12-23');
INSERT INTO funcion(
            idpelicula, idsala, horainicio ,fecha)
    	VALUES ( 2, 9, '17:00', '2019-12-23');
INSERT INTO funcion(
            idpelicula, idsala, horainicio ,fecha)
    	VALUES ( 3, 3, '17:00', '2019-12-23');
INSERT INTO funcion(
            idpelicula, idsala, horainicio ,fecha)
    	VALUES ( 3, 6, '17:00', '2019-12-23');
INSERT INTO funcion(
            idpelicula, idsala, horainicio ,fecha)
    	VALUES ( 3, 10, '17:00', '2019-12-23');
		
		
		
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 1);








INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 1);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 2, 1);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 3, 1);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 4, 1);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 5, 1);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 6, 1);


INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 7, 1);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 8, 1);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 9, 1);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 10, 1);
		
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 2);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 2, 2);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 3, 2);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 4, 2);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 5, 2);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 6, 2);


INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 7, 2);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 8, 2);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 9, 2);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 10, 2);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 3);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 2, 3);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 3, 3);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 4, 3);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 5, 3);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 6, 3);


INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 7, 3);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 8, 3);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 9, 3);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 10, 3);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 4);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 2, 4);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 3, 4);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 4, 4);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 5, 4);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 6, 4);


INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 7, 4);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 8, 4);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 9, 4);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 10, 4);
		
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 5);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 2, 5);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 3, 5);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 4, 5);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 5, 5);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 6, 5);


INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 7, 5);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 8, 5);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 9, 5);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 10, 5);
		
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 6);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 2, 6);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 3, 6);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 4, 6);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 5, 6);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 6, 6);


INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 7, 6);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 8, 6);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 9, 6);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 10, 6);
		
		
		
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 7);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 2, 7);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 3, 7);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 4, 7);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 5, 7);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 6, 7);


INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 7, 7);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 8, 7);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 9, 7);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 10, 7);
		
		
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 8);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 2, 8);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 3, 8);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 4, 8);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 5, 8);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 6, 8);


INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 7, 8);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 8, 8);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 9, 8);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 10, 8);
		
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 1, 9);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 2, 9);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 3, 9);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 4, 9);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 5, 9);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 6, 9);


INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 7, 9);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 8, 9);

INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 9, 9);
INSERT INTO public.asiento(
            nroasiento, idsala)
    	VALUES ( 10, 9);