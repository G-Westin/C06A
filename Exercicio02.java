import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a NPA: ");
        float NPA = entrada.nextInt();
        if(NPA >= 60 && NPA <= 100){
            System.out.println("Voce passou!");
        }else if(NPA < 60 && NPA >= 30){
            System.out.println("Voce ficou de NP3!");
                System.out.println("digite a nota da Np3:");
            float NP3 = entrada.nextInt();
            if(NP3 >= 50){
                System.out.println("Voce passou com a Np3!");
            }else{
                System.out.println("Voce Reprovou!!");
            }
        }
        entrada.close();
    }

}
