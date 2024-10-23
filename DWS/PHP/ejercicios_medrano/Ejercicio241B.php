<?php

/* Una función que concatene todos los parámetros recibidos separándolos con un 
espacio: function concatenar(...$palabras) : string. Utiliza el operador ....*/
function concatenar(...$palabras) : string{
    return implode(" ", $palabras);
};

echo concatenar("1", "2", "3", "4", "5");

?>