<?php
require_once('car.php');
class uberVan extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){
        //Acceso a la super clase
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    // Polimorfismo, sobreescribir el método set
    public function setPassenger($passenger){
        if($passenger == 6){
            $this->passenger = $passenger;
        }else{
            echo "Necesita asignar 6 pasajeros";
        }
    }
}

?>