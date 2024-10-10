<?php
    $hora = "14"; // A diferencia de javascript, el switch lo hace
    // con == por eso no funciona si lo ponemos con "14".
if ($hora === 8) {
    echo "Es la hora de desayunar.";
} else if ($hora === 14) {
    echo "Es la hora de la comida.";
} else if ($hora === 21) {
    echo "Es la hora de la cena.";
} else {
    echo "Ahora no toca comer.";
}
    ?>