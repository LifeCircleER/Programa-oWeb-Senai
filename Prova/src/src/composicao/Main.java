package src.composicao;

public class Main {

    public static void main(String[] args) {

        //Composição
        Carro carro = new Carro("Bmw");

        System.out.println(carro.getPneu());
        carro = null;
        System.out.println(carro.getPneu());

    }

}
