public class PreparoSuplex extends PreparoDrinks{
    String ingredientes = "4 Extratos de Bronson, 3 Flanerguitas e 3 Karmotrinas";

    PreparoSuplex(){
    }

    PreparoSuplex(String ingredientes){
        this.ingredientes = ingredientes;
    }

    void AddIngredientes(){
        System.out.println("Adicionando ingredientes: " + ingredientes + "...");
    }

    void AddGelo(){
        super.AddGelo();
    }

    void Misturar(){
        super.Misturar();
    }

    void Servir(){
        System.out.println("-----------------------------------------");
        System.out.println("Seu drink está pronto!");
        System.out.println("Servindo um Suplex...");
        System.out.println("Preço: $160");
        System.out.println("-----------------------------------------");
    }
}
