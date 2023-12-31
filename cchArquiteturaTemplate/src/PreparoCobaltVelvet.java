public class PreparoCobaltVelvet extends PreparoDrinks{
    String ingredientes = "2 Adelídeos, 3 Flanerguitas e 5 Karmotrinas";

    PreparoCobaltVelvet(){
    }

    PreparoCobaltVelvet(String ingredientes){
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
        System.out.println("Servindo um Cobalt Velvet...");
        System.out.println("Preço: $280");
        System.out.println("-----------------------------------------");
    }
}
