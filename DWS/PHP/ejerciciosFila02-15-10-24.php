<?php

/* ACTIVIDADES BUCLES */
echo "ACTIVIDADES BUCLES <hr>";
echo "220: <br>";
/* Escribe un programa que muestre los números pares del 0 al 50 
(dentro de una lista desordenada).*/
$lista = [
    37, 4, 27, 1, 9, 49, 12, 3, 25, 22, 35, 30, 0, 47, 6, 21, 45, 19, 38, 14,
    44, 5, 16, 31, 24, 11, 7, 50, 33, 32, 17, 23, 39, 43, 20, 29, 8, 36, 28,
    18, 48, 2, 41, 10, 40, 46, 15, 34, 42, 26, 13
];

for ($i = 0; $i < count($lista); $i++){
    if($lista[$i] % 2 == 0){
        echo "$lista[$i], ";
    } else {
        continue;
    }
}
echo "<br><br>";

/* ACTIVIDADES PHP BÁSICO */
/* Muestra 3 frases, cada una en un párrafo utilizando las tres 
posibilidades que existen de mostrar contenido. Tras ello, 
introduce dos comentarios, uno de bloque y otro de una línea. */
echo "ACTIVIDADES PHP BÁSICO <hr>";
echo "201: <br>";

echo "Frase 1.<br>";
print "Frase 2.<br>";
printf("Frase 3.");
echo "<br><br>";

/* ACTIVIDADES PHP BÁSICO */
/* Rellena un array con 50 números aleatorios comprendidos entre el 0 y el 99,
y luego muéstralo en una lista desordenada. Para crear un número aleatorio, 
utiliza la función rand(inicio, fin) */
echo "ACTIVIDADES PHP BÁSICO <hr>";
echo "230: <br>";
echo "<br>";
?>