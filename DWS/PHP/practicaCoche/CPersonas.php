<?php

include 'Coche.php';

class CPersonas extends coche
{

    public int $pasajerosMax;
    public int $pasajerosActual;

    public function __construct(
        string $marca,
        string $modelo,
        int $anyo,
        float $veloActual,
        $pasajerosMax,
        $pasajerosActual
    ) {
        parent::__construct(
            $marca,
            $modelo,
            $anyo,
            $veloActual
        );
        $this->pasajerosMax = $pasajerosMax;
        $this->pasajerosActual = $pasajerosActual;
    }

    // Getters
    public function getPasajerosMax()
    {
        return $this->pasajerosMax;
    }

    public function getPasajerosActual()
    {
        return $this->pasajerosActual;
    }

    // Setters
    public function setPasajerosMax($pasajerosMax)
    {
        $this->pasajerosMax = $pasajerosMax;
        return $this;
    }

    public function setPasajerosActual($pasajerosActual)
    {
        $this->pasajerosActual = $pasajerosActual;
        return $this;
    }

    // Funciones
    public function detalles()
    {
        parent::detalles();
        echo "Pasajeros máximo: " . $this->pasajerosMax . " personas.<br>" .
            "Pasajeros actual: " . $this->pasajerosActual . " personas.<br>";
    }

    public function subenBajanPasajeros(int $nuevoPasaje)
    {
        $nuevoPasajeTotal = $this->pasajerosActual + $nuevoPasaje;
        if($nuevoPasajeTotal > $this->pasajerosMax){
            $this->pasajerosActual = $this->pasajerosMax;
        } else if ($nuevoPasajeTotal < 0){
            $this->pasajerosActual = 0;
        } else {
            $this->pasajerosActual = $nuevoPasajeTotal;
        }
    }

    public function mostrarPasajeActual()
    {
        echo "Pasajeros actual: " . $this->pasajerosActual . " Personas.<br>";
    }
}

$CP1 = new CPersonas(
    "Scania",
    "r450",
    "2022",
    75,
    200,
    20
);

$CP1->detalles();
$CP1->subenBajanPasajeros(10);
$CP1->mostrarPasajeActual();
