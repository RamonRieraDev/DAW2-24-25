<?php
// Declarar clase
class coche{
    private string $marca;
    private string $modelo;
    private int $anyo;
    private float $veloActual;
    private static int $numCoches = 0;
    private static array $arrayCoches = [];

// Constructor
public function __construct(
    string $marca,
    string $modelo,
    int $anyo,
    float $veloActual = 0.0,
    // array $arrayCoches = []
){
    $this->marca = $marca;
    $this->modelo = $modelo;
    $this->anyo = $anyo;
    $this->veloActual = $veloActual;
    self::$numCoches++;
    self::$arrayCoches[] = $this;
}

// Setters
public function setMarca(string $marca){
    $this->marca = $marca;
}

public function setModelo(string $modelo){
    $this->modelo = $modelo;
}

public function setAnyo(int $anyo){
    $this->anyo = $anyo;
}

public function setVeloActual(float $veloActual){
    $this->veloActual = $veloActual;
}

// Getters
public function getMarca() : string {
    return $this->marca;
}

public function getModelo() : string {
    return $this->modelo;
}

public function getAnyo() : int {
    return $this->anyo;
}

public function getVeloActual() : float {
    return $this->veloActual;
}

public static function getNumCoches() : int {
    return self::$numCoches;
}

public static function getArrayCoches() : array {
    return self::$arrayCoches;
}

// Método detalles
public function detalles(){
    echo "Marca: $this->marca," . "<br>" . 
    "Modelo: $this->modelo," . "<br>" . 
    "Año: $this->anyo," . "<br>" .
    "Velocidad Actual: $this->veloActual km/h" . "<br>";
}

// Método acelerar
public function acelerar(float $incremento){
    $this->veloActual += $incremento;
}

// Método frenar
public function frenar(float $decremento){
    $this->veloActual -= $decremento;
}

// Método contar coches
public static function contCoche(): int{
    return self::$numCoches++;
}
}

// Declarar coche0
$coche0 = new coche(
    "Audi",
    "A4",
    2000,
    120.0
);

// // Imprimir coche1
// echo $coche1->detalles() . "<br>";

// $coche1->acelerar(25);
// echo "Velocidad al acelerar: <br>" . $coche1->detalles() . "<br>";
 
// $coche1->frenar(25);
// echo "Velocidad al frenar: <br>" . $coche1->detalles() . "<br>";

// Declarar coche1
$coche1 = new coche(
    "Peugeot",
    "208",
    2010,
    80.0
);

// Declarar coche2
$coche2 = new coche(
    "Ford",
    "Courier",
    2024,
    100.0
);

// Declarar coche3
$coche3 = new coche(
    "Skoda",
    "Fabia",
    1990,
    20.0
);

// Imprimir coche0, coche1, coche2 y coche3
echo $coche0->detalles() . "<br>";
echo $coche1->detalles() . "<br>";
echo $coche2->detalles() . "<br>";
echo $coche3->detalles() . "<br>";

// Total de coches
echo "Total de coches: " . coche::getNumCoches() . "<br>";

// Añadir coches
foreach (coche::getArrayCoches() as $coche) {
    echo $coche->detalles() . "<br>";
}
?>