public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Volksvagwen");
        System.out.println(carro.getPneu());
        carro = null;
        System.out.println(carro.getPneu());

    }
}
