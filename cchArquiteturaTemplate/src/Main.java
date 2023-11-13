import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("CALICOMP v1.1");
        System.out.println("Mixing drinks and changing lives.");
        System.out.println("-----------------------------------------");

        PreparoDrinks preparoDrinks = new PreparoBloomLight();
        preparoDrinks.AddIngredientes();
        preparoDrinks.AddGelo();
        preparoDrinks.EnvIngredientes();
        preparoDrinks.Misturar();
        preparoDrinks.Servir();

        PreparoDrinks preparoDrinks2 = new PreparoSunshineCloud();
        preparoDrinks2.AddIngredientes();
        preparoDrinks2.AddGelo();
        preparoDrinks2.Bater();
        preparoDrinks2.Servir();
    }
}