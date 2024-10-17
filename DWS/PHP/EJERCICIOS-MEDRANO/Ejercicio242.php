<?php

/* EJERCICIO 242: 
Añade las siguientes funciones:

242.1 - digitos(int $num): int → devuelve la cantidad de dígitos de un número.
242.2 - digitoN(int $num, int $pos): int → devuelve el dígito que ocupa, empezando por la izquierda, la posición $pos.
242.3 - quitaPorDetras(int $num, int $cant): int → le quita por detrás (derecha) $cant dígitos.
242.4 - quitaPorDelante(int $num, int $cant): int → le quita por delante (izquierda) $cant dígitos.

Para probar las funciones, haz uso tanto de paso de argumentos posicionales como argumentos con nombre.*/

// 242.1:
echo "Resultado ejercicio 242.1:<br>";
function digitos(int $num): int {
    return strlen($num);
}
echo digitos(1234);
echo "<hr>";

// 242.2:
echo "Resultado ejercicio 242.:<br>";
function digitoN(int $num, int $pos): int { 
    return substr($num, $pos - 1, 1);   
}
echo digitoN(1234, 1);
echo "<hr>";

// 242.3:
echo "Resultado ejercicio 242.3:<br>";
function quitaPorDetras(int $num, int $cant): int {
    return substr($num, 0, -$cant);
}
echo quitaPorDetras(1234, 1);

echo "<hr>";

// 242.4:
echo "Resultado ejercicio 242.4:<br>";
function quitarPorDelante(int $num, int $cant) : int {
    return substr($num, $cant);
}
echo quitarPorDelante(1234, 1);

echo "<hr>";
?>