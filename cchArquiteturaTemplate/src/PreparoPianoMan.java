public class PreparoPianoMan extends PreparoDrinks{
    String ingredientes = "2 Adelídeos, 3 Extratos de Bronson, 5 Deltas em Pó, 5 Flanerguitas e 3 Karmotrinas";

    PreparoPianoMan(){
    }

    PreparoPianoMan(String ingredientes){
        this.ingredientes = ingredientes;
    }

    void AddIngredientes(){
        System.out.println("Adicionando ingredientes: " + ingredientes + "...");
    }

    void AddGelo(){
        System.out.println("Adicionando gelo...");
    }

    void Misturar(){
        System.out.println("Misturando o drink...");
    }

    void Servir(){
        System.out.println("-----------------------------------------");
        System.out.println("Seu drink está pronto!");
        System.out.println("Servindo um Piano Man...");
        System.out.println("Preço: $320");
        System.out.println("-----------------------------------------");
    }
}
