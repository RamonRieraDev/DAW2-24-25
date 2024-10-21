<?php

/*
Ejercicio 222

222.1 - A partir de una base y exponente, mediante la acumulación de productos, calcula la potencia utilizando la instrucción for.
*/
echo "Resultado ejercicio 222.1:<br>";
function potencia($base, $exponente){
    $resultado = 1;
    for ($i = 0; $i < $exponente; $i++){
        $resultado *= $base;
    }
    return $resultado;
}
echo potencia(2, 3);
echo "<hr>";

/*
222.2 - Reescribe el ejercicio anterior haciendo uso sólo de while.
*/
echo "Resultado ejercicio 222.2:<br>";
function potencia2($base, $exponente){
    $resultado = 1;
    $contador = 0;
    while ($contador < $exponente){
        $resultado *= $base;
        $contador++;
    }
    
    return $resultado;
}
echo potencia2(2, 3);
echo "<hr>";

/*
222.3 - Reescribe el ejercicio anterior haciendo uso sólo de do-while.
*/
echo "Resultado ejercicio 222.2:<br>";
function potencia3($base, $exponente){
    $resultado = 1;
    $contador = 0;
    do {
        $resultado *= $base;
        $contador++;
        
    } while ($contador < $exponente);
    return $resultado;
}
echo potencia3(2, 3);
echo "<hr>";
?>