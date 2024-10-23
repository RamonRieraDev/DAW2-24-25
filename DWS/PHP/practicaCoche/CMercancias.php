<?php

include 'Coche.php';

class CMercancias extends coche
{

    public int $cargaMax;
    public int $cargaActual;

    public function __construct(
        string $marca,
        string $modelo,
        int $anyo,
        float $veloActual,
        $cargaMax,
        $cargaActual
    ) {
        parent::__construct(
            $marca,
            $modelo,
            $anyo,
            $veloActual
        );
        $this->cargaMax = $cargaMax;
        $this->cargaActual = $cargaActual;
    }

    // Getters
    public function getCargaMax()
    {
        return $this->cargaMax;
    }

    public function getCargaActual()
    {
        return $this->cargaActual;
    }

    // Setters
    public function setCargaMax($cargaMax)
    {
        $this->cargaMax = $cargaMax;
        return $this;
    }

    public function setCargaActual($cargaActual)
    {
        $this->cargaActual = $cargaActual;
        return $this;
    }

    // Funciones
    public function detalles()
    {
        parent::detalles();
        echo "Carga máxima: " . $this->cargaMax . " Kg.<br>" .
            "Carga actual inicial: " . $this->cargaActual . " Kg.<br>";
    }

    public function cargaDescarga(int $nuevaCarga)
    {
        $nuevaCargaTotal = $this->cargaActual + $nuevaCarga;
        if($nuevaCargaTotal > $this->cargaMax){
            $this->cargaActual = $this->cargaMax;
        } else if ($nuevaCargaTotal < 0){
            $this->cargaActual = 0;
        } else {
            $this->cargaActual = $nuevaCargaTotal;
        }
    }

    public function mostrarCargaActual()
    {
        echo "Carga actual posterior: " . $this->cargaActual . " Kg.<br>";
    }
}

$CM1 = new CMercancias(
    "Ford",
    "Custom",
    "2024",
    110,
    1000,
    400
);

$CM1->detalles();
$CM1->cargaDescarga(-100);
$CM1->mostrarCargaActual();
