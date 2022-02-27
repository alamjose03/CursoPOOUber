//Clase y metodo constructor implicitamente
function Car(license, drive){
    this.id;
    this.license = license;
    this.driver = drive;
    this.passenger;
} 

// Creamos un método para imprimir
Car.prototype.printDataCar = function(){
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
}