import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{

    // Mapa con la marca del vehiculo, la lista de modelos con sus años respectivos
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver); 
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
        
    }  

    public UberVan(String license, Account driver){
        super(license, driver); 
    }  

    //Polimorfismo y sobre escribir el método que proviene de la clase padre
    @Override
    public void setPassenger(Integer passenger) {
        // super.setPassenger(passenger); borramos porque necesitamos un comportamiento distinto del padre
        if(passenger == 6){
            this.passenger = passenger; 
        }
        else{
            System.out.print("Necesitas asignar 4 pasajeros");
        }
    }
    
}
