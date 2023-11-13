public class PreparoBloomLight extends PreparoDrinks{
    String ingredientes = "4 Adelídeos, 1 Delta em Pó, 2 Flanerguitas e 3 Karmotrinas";

    PreparoBloomLight(){
    }

    PreparoBloomLight(String ingredientes){
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

    void Servir(){
        System.out.println("-----------------------------------------");
        System.out.println("Seu drink está pronto!");
        System.out.println("Servindo um Bloom Light...");
        System.out.println("Preço: $230");
        System.out.println("-----------------------------------------");
    }
}