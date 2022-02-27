<?php
require_once('payment.php');
class Card extends payment{
    public $id;
    public $number;
    public $cvv;
    public $date;

    public function __construct($id, $number){
        //Acceso a la super clase
        parent::__construct($id);
        $this->number = $number;
    }
}

?>