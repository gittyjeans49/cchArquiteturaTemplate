public class PreparoPianoWoman extends PreparoDrinks{
    String ingredientes = "5 Adelídeos, 5 Extratos de Bronson, 2 Deltas em Pó, 3 Flanerguitas e 3 Karmotrinas";

    PreparoPianoWoman(){
    }

    PreparoPianoWoman(String ingredientes){
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
        System.out.println("Servindo um Piano Woman...");
        System.out.println("Preço: $320");
        System.out.println("-----------------------------------------");
    }
}
