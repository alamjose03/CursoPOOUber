var car = new Car("AWS!", new Account("Andres Herrera", "AN920"));
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AHK292", new Account("Andrea Fernan", "ANF72"), "Chevrolet", "Spark");
uberX.printDataCar();

console.log("--------USER & DRIVER--------");
var user = new User("Alam Pérez", "AP03");
user.printDataAccount();

var driver = new Driver("Maria Cih", "MC03");
driver.printDataAccount(); 

var uberPool = new UberPool("JSK384", new Account("Andres Fernando", "ANF01"), "Dodge", "Attitude");
uberPool.setPassenger(4);
uberPool.printDataCar();

var uberVan = new UberVan("JSL00", new Account("Anny", "Rodriguez"), "BMW", "Cadillac");
uberVan.setPassenger(6);
uberVan.printDataCar();
