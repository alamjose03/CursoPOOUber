class Main{
    //Método
    public static void main(String[] args) {
        System.out.println("Mexico");

        //Creando Objetos usando el constructor con datos obligatorios
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AN123"));
        // car.passenger = 4;
        car.printDataCar();
        
        Car car2 = new Car("QWE123", new Account("Maria Herrera", "MA465"));
        car2.printDataCar();

        UberX uberX = new UberX("MHF689", new Account("Andrea Fernan", "ANF72"), "Chevrolet", "Spark");
        // uberX.passenger = 3;
        uberX.setPassenger(4);
        uberX.getPassenger();
        uberX.printDataCar();

        UberVan uberVan = new UberVan("AJF093", new Account("Andres Herrera", "ANHR20"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        User user = new User("Alam Pérez", "AJ03");
        user.printDataAccount();

        Driver driver = new Driver("Maria Cih", "MC03");
        driver.printDataAccount();
    }
}