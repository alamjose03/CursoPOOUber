public class Car {
    //Propiedades o atributos 
    private Integer id;
    private String license;
    private Account driver; // Necesita instancia de account
    protected Integer passenger; // Encapsulamos  agregar un modificador de acceso

    // Método constructor
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        this.passenger = 3;
        System.out.println("Passengers: " + passenger);
    }

    // Método para traer los datos de esa clase y el driver necesita acceder a la propiedad nombre de la clase account
    void printDataCar(){
        System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passenger);
    }

    // Métodos Getters y Setters (acceder a atributos con modificadores de acceso especificos)
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger; 
        }
        else{
            System.out.print("Necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    

}
