import java.util.Random;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args){
        Random rand = new Random();
        int numSecreto = rand.nextInt(10)+1; //gera o numero entre 1 e 10

        Scanner sc = new Scanner(System.in);
        int palpite = 0;

        System.out.println("JOGO DE ADVINHACAO");

        while(palpite != numSecreto){
            System.out.print("Digite um numero entre 1 e 10: ");
            palpite = sc.nextInt();

        }
        sc.close();
    }

}