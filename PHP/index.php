<?php
require_once('car.php'); 
require_once('account.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('uberVan.php');
require_once('user.php');
require_once('driver.php');

$car = new Car("AO058", new Account("Andres Herrera", "AN084"));
echo $car->PrintDataCar();
 

$uberX = new uberX("CVB123", new Account("Andres Herrera", "AND948"), "Chevrolet", "Spark");
echo "<br>";
echo $uberX->PrintDataCar();

$uberPool = new uberPool("ZKL1", new Account("Andrea Herrera", "AND892"), "Dogde", "Attitude");
$uberPool->setPassenger(4);
echo "<br>";
echo $uberPool->PrintDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(6);
echo "<br>";
echo $uberVan->PrintDataCar();

$user = new User("Alam Pérez", "AP00");
$user->printDataAccount();

$driver = new Driver("Maria Cih", "MC00");
$driver->printDataAccount();


?>