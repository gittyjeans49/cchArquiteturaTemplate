public class PreparoFringeWeaver extends PreparoDrinks{
    String ingredientes = "1 Adelídeo e 9 Karmotrinas";

    PreparoFringeWeaver(){
    }

    PreparoFringeWeaver(String ingredientes){
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
        System.out.println("Servindo um Fringe Weaver...");
        System.out.println("Preço: $260");
        System.out.println("-----------------------------------------");
    }
}
