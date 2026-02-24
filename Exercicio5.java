import java.util.Random;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Random rand = new Random();
        int numSecreto = rand.nextInt(10)+1; //gera o numero entre 1 e 10

        Scanner sc = new Scanner(System.in);
        int palpite = 0;

        System.out.println("JOGO DE ADVINHACAO");

        while(palpite != numSecreto){
            System.out.print("Digite um numero entre 1 e 10: ");
            palpite = sc.nextInt();

            if(palpite < numSecreto){
                System.out.println("O numero digitado menor que o numero secreto!!");
            }else if(palpite > numSecreto){
                System.out.println("O numero digitado é maior que o numero secreto!!");
            }else{
                System.out.println("!!!!!!Voce acertou o numero!!!!!!");
            }

        }
        sc.close();
    }

}