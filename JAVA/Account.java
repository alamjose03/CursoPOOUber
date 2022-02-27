public class Account {
    //Propiedades o atributos 
    Integer id;
    String name;
    String document;
    String email;
    String password;

    // Método constructor
    public Account(String name, String document){
        this.name = name;
        this.document = document;
    }

    // Método
    void printDataAccount(){
        System.out.println("Name: " + this.name);
        System.out.println("Document: " + this.document);
    }
        

}
