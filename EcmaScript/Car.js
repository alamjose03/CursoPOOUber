class Car{

    // Método constructor
    constructor(license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this._passenger; // Privado con # y protected con _
    }

    // Método 
    printDataCar(){
        console.log(this.driver);
        console.log(this.driver.name); 
        console.log(this.driver.document);
        console.log("Passenger: " + this.passenger);
    }
 
    // Método Get
    get getPassenger(){
        return this.passenger;
    }

    // Método Set
    setPassenger(passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            console.log("Necesitas asignar 4 pasajeros");
        }
    }

}