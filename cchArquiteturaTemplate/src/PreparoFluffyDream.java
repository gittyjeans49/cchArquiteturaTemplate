public class PreparoFluffyDream extends PreparoDrinks{
    String ingredientes = "3 Adelídeos, 3 Deltas em Pó e Karmotrina (opcional)";

    PreparoFluffyDream(){
    }

    PreparoFluffyDream(String ingredientes){
        this.ingredientes = ingredientes;
    }

    void AddIngredientes(){
        System.out.println("Adicionando ingredientes: " + ingredientes + "...");
    }

    void EnvIngredientes(){
        System.out.println("Envelhecendo os ingredientes...");
    }

    void Misturar(){
        System.out.println("Misturando o drink...");
    }

    void Servir(){
        System.out.println("-----------------------------------------");
        System.out.println("Seu drink está pronto!");
        System.out.println("Servindo um Fluffy Dream...");
        System.out.println("Preço: $170");
        System.out.println("-----------------------------------------");
    }
}
