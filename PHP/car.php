<?php
require_once ('account.php');
class Car{ 
    public $id;
    public $license;
    public $driver;
    protected $passenger;

      // Constructor
    public function __construct($license, Account $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function PrintDataCar(){
        return "Licencia: $this->license 
        Driver: {$this->driver->name} 
        Número de pasajeros: $this->passenger
        
        ";
    }

    // Get y Set
    public function getPassenger(){
        return $this->passenger;
    }

    public function setPassenger($passenger){
        if($passenger == 4){
            $this->passenger = $passenger;
        }else{
            echo "<br>Necesita 4 pasajeros<br>";
        }
    }
}
?>