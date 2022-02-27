class UberVan extends Car{

    // Método constructor
    constructor(license, driver, typeCarAccepted, seatsMaterial){
        super(license, driver)
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    // Polimorfismo
    setPassenger(passenger){
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            console.log("Necesita asignar 6 pasajeros");
        }
    }

} 