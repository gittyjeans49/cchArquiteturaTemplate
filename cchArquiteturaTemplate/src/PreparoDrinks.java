public abstract class PreparoDrinks {
    String ingredientes;

    PreparoDrinks(){

    }

    PreparoDrinks(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    void AddIngredientes(){
        System.out.println("Adicionando ingredientes: " + ingredientes + "...");
    }

    void AddGelo(){
        System.out.println("Adicionando gelo...");
    }

    void EnvIngredientes(){
        System.out.println("Envelhecendo os ingredientes...");
    }

    void Misturar(){
        System.out.println("Misturando o drink...");
    }

    void Bater(){
        System.out.println("Fazendo uma batida...");
    }

    void Servir(){
        System.out.println("-----------------------------------------");
        System.out.println("Seu drink está pronto!");
        System.out.println("Servindo um + " + "...");
        System.out.println("Preço: $");
        System.out.println("-----------------------------------------");
    }
}
