class Card extends Payment{

    // Método constructor
    constructor(id){
        super(id)
        this.id = id;
        this.number;
        this.cvv;
        this.date;
    }
}