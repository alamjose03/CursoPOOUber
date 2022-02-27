<?php
require_once('car.php');
class uberPool extends Car{
    public $brand;
    public $model;

    public function __construct($license, $driver, $brand, $model){
        //Acceso a la super clase
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}

?>