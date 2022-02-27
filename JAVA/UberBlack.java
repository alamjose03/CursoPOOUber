import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car{

    // Mapa con la marca del vehiculo, la lista de modelos con sus años respectivos
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    // Método contructor
    public UberBlack(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        super(license, driver); 
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
        
    }  
    
}
