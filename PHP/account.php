<?php
class Account{
    public $id;
    public $name;
    public $document; 
    public $email;
    public $password; 

    // Constructor
    public function __construct($name, $document){
        $this->name = $name;
        $this->document = $document;
    }
    
    public function printDataAccount(){
        echo "<br>";
        echo "Name: " . $this->name . " Document: " . $this->document;
    }
}
?>