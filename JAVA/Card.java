import java.sql.Date;

public class Card extends Payment{

    // Propiedades
    Integer id;
    Integer number;
    Integer cvv;
    Date date;

    // Método constructor
    public Card(Integer id, Integer number){
        super(id);
        this.number = number;

    }
}
