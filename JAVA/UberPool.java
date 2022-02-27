public class UberPool extends Car{
    // Propiedades propias de la clase UberX
    String brand;
    String model;

    //Constructor que coincide con la clase padre, heredado de la clase car
    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver); 
        this.brand = brand;
        this.model = model;
    }
    
}
