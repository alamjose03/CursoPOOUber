class Account{

    // Método constructor
    constructor(name, document){
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }

    // Método 
    printDataAccount(){
        console.log("Name: " + this.name);
        console.log("Document: " +this.document);
    }
}