<?php
require_once('car.php');
class uberBlack extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        //Acceso a la super clase
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}

?>