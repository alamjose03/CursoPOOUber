<?php
require_once('payment.php');
class Paypal extends payment{
    public $id;
    public $email;

    public function __construct($id, $email){
        //Acceso a la super clase
        parent::__construct($id);
        $this->email = $email;
    }
}

?>