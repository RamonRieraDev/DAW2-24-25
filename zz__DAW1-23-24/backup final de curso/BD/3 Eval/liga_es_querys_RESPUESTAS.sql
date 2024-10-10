/*1 - Obtener los datos de jugadores que miden más que la media de 
su equipo. Se mostrará el nombre y apellidos del jugador, 
el nombre del equipo al que pertenece, su fecha de incorporación, 
su salario, su altura y la media de altura de su equipo.*/

SELECT 
CONCAT (j.nombre, ' ',j.apellidos) AS JUGADOR,
e.nombre AS EQUIPO,
j.fechaIncorporacion AS FECHA_INCORPORACION,
j.salario,
j.altura,
MEDIA.MEDIA_ALTURA_EQUIPO
FROM 
    jugador j
JOIN 
    equipo e ON j.equipo = e.Id
JOIN 
    (SELECT j2.equipo, AVG(j2.altura) AS MEDIA_ALTURA_EQUIPO
     FROM jugador j2
     GROUP BY j2.equipo) 
AS MEDIA ON j.equipo = MEDIA.equipo
WHERE 
    j.altura > MEDIA.MEDIA_ALTURA_EQUIPO;

/*2 - Nombre, ciudad y web de aquellos equipos con más de dos 
jugadores registrados en la base de datos.*/

SELECT DISTINCT e.nombre AS EQUIPO, e.ciudad, e.webOficial
FROM equipo e
JOIN jugador j ON e.Id = j.equipo WHERE j.equipo IN(
	SELECT j2.equipo
    FROM jugador j2
    GROUP BY j2.equipo 
    HAVING COUNT(j2.Id) > 2
    )
;
    
/* 3 - Buscar los jugadores cuyo salario sea menor que el de sus 
capitanes. Mostrar por pantalla el nombre completo del jugador, 
su salario, el nombre completo de su capitán y el salario de su 
capitán.*/

SELECT 
    CONCAT(j.nombre, ' ', j.apellidos) AS JUGADOR,
    j.salario AS SALARIO_JUGADOR,
    CONCAT(c.nombre, c.apellidos) AS CAPITAN,
    c.salario AS SALARIO_CAPITAN
FROM 
    jugador j
JOIN 
    jugador c ON j.capitan = c.Id
WHERE 
    j.salario < c.salario;
    
SELECT *
FROM jugador;
    
/* 4 - Obtener el nombre completo de los jugadores que ganen más 
que cualquiera de los del Real Madrid.*/

SELECT 
    CONCAT(j.nombre, ' ', j.apellidos) AS JUGADOR
FROM 
    jugador j
WHERE 
    j.salario > (
    SELECT MAX(salario) 
	FROM jugador 
    WHERE equipo = (
		SELECT Id FROM equipo WHERE nombre = 'Real Madrid'
        )
	)
;

/* 5 - Mostrar la media de altura cuando ésta sea superior a 2 
metros para cada equipo y cada posición. Esta consulta debe ser 
ordenada por nombre del equipo y, luego, por posición. Se mostrará 
el nombre del equipo, la posición y la media de altura por equipo
y posición.*/

SELECT 
    e.nombre AS EQUIPO,
    p.descripcion AS POSICION,
    AVG(j.altura) AS MEDIA_ALTURA
FROM 
    equipo e
JOIN 
    jugador j ON e.Id = j.equipo
JOIN 
    posicion p ON j.posicion = p.Id
GROUP BY 
    e.Id, p.Id
HAVING 
    AVG(j.altura) > 2
ORDER BY 
   e.Id, p.Id;