<?php

class MayorMenor {
    private int $mayor;
    private int $menor;

    public function setMayor(int $may) {
        $this->mayor = $may;
    }

    public function setMenor(int $men) {
        $this->menor = $men;
    }

    public function getMayor() : int {
        return $this->mayor;
    }

    public function getMenor() : int {
        return $this->menor;
    }
}

function maymen(array $numeros) : ?MayorMenor {
    $a = max($numeros);
    $b = min($numeros);

    $result = new MayorMenor();
    $result->setMayor($a);
    $result->setMenor($b);

    return $result;
}

$resultado =  maymen([1,76,9,388,41,39,25,97,22]);
echo "<br>Mayor: ".$resultado->getMayor();
echo "<br>Menor: ".$resultado->getMenor();

class coche {
    private static $numCoches = 0;
    private $marca;

    public function __construct(string $m){
        self::$numCoches++;
        $this->marca = $m;
    }

    public function mostrarMarca() : string {
        return "El producto ".$this->marca." es el número ".self::$numCoches;
    }
}

$coche1 = new coche ("Ford");
$coche2 = new coche ("Audi");
$coche3 = new coche ("Bmw");

echo $coche2->mostrarMarca();