public class Zumbi {
    String nome;
    float velocidade;
    double vida;
    float quantidade;

    public void gritar(){
        System.out.println("Zumbi esta gritando!!!");
    }

    void transferencia_vida(Zumbi z2, float quantia){
        vida -= quantidade;
        z2.vida += quantidade;
    }

}
