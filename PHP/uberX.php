<?php
require_once('car.php');
class uberX extends Car{
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        //Acceso a la super clase
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }

    // Polimorfismo de la impresión de datos
    public function PrintDataCar(){
        echo "License: $this->license
        Name: {$this->driver->name}
        Brand: $this->brand
        Model: $this->model
        ";
    }
}

?>