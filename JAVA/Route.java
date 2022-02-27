import java.util.ArrayList;

public class Route {
    //Propiedades o atributos 
    Integer id;
    ArrayList<Double> start;
    ArrayList<Double> end;

    // Método constructor
    public Route(Integer id, ArrayList<Double> start, ArrayList<Double> end){
        this.id = id;
        this.start = start;
        this.end = end;
    }
    
}
