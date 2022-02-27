class UberX extends Car{

    // Método constructor
    constructor(license, driver, brand, model){
        super(license, driver)
        this.brand = brand;
        this.model = model;
    }

    // Polimorfismo
    printDataCar(){
        super.printDataCar();
        console.log(this.brand);
        console.log(this.model);
    }
} 