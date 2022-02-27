<?php
require_once('payment.php');
class Cash extends payment{
    public $id;

    public function __construct($id){
        //Acceso a la super clase
        parent::__construct($id);
    }
}

?>