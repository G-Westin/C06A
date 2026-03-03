import java.awt.*;

public class Main {
    public static void main(String[] args){
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Chris";
        z2.nome = "Pizzozin";
        z1.vida = 50;
        z2.vida = 20;

        z1.gritar();
        z2.gritar();

        System.out.println("A vida inicial do Zumbi 1: " + z1.vida);
        System.out.println("A vida inicial do Zumbi 2: " + z2.vida);

        z1.transferencia_vida(z2, 20);
            System.out.println("Quantidade de vida do Zumbi 1: " +z1.vida);
            System.out.println("Quantidade de vida do Zumbi 2: " + z2.vida);
    }
}
