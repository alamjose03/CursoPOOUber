<?php
    class Route{
        public $id;
        public $start = array();
        public $end = array();

        public function __construct($id,  $start, $end){
            $this->id = $id;
            $this->start = $start;
            $this->end = $end;
        }
    }
?>