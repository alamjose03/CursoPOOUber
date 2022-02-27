public class Paypal extends Payment{

    // Propiedades
    Integer id;
    String email;

    // Método constructor
    public Paypal(Integer id, String email){
        super(id);
        this.email = email;

    }
}
