<?php

$respuestas = array(
    "Sí", 
    "No", 
    "Quizás", 
    "Claro que sí", 
    "Por supuesto que no", 
    "No lo tengo claro", 
    "Seguro", 
    "Yo diría que sí", 
    "Ni de coña", 
    "Probablemente"
);

$respuesta = $respuestas[array_rand($respuestas)];

if(isset($_GET['pregunta'])){
    echo "Tu respuesta es: " . $respuesta;
};

?>