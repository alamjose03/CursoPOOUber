public class UberX extends Car{
    // Propiedades propias de la clase UberX
    String brand;
    String model;

    //Constructor que coincide con la clase padre, heredado de la clase car
    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); 
        this.brand = brand;
        this.model = model;
    }  

    //Polimorfismo
    @Override
    void printDataCar() {
        // Haz lo de tu padre
        super.printDataCar();
        // Pero además haz esto
        System.out.println("Brand: " + brand + " model: " + model);
    }
    
}
