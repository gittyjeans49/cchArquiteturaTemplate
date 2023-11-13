public class PreparoSunshineCloud extends PreparoDrinks{
    String ingredientes = "2 Adelídeos, 2 Extratos de Bronson e Karmotrina (opcional)";

    PreparoSunshineCloud(){
    }

    PreparoSunshineCloud(String ingredientes){
        this.ingredientes = ingredientes;
    }

    void AddIngredientes(){
        System.out.println("Adicionando ingredientes: " + ingredientes + "...");
    }

    void AddGelo(){
        super.AddGelo();
    }

    void Bater(){
        super.Bater();
    }

    void Servir(){
        System.out.println("-----------------------------------------");
        System.out.println("Seu drink está pronto!");
        System.out.println("Servindo um Sunshine Cloud...");
        System.out.println("Preço: $150");
        System.out.println("-----------------------------------------");
    }
}
