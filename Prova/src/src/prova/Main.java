package src.prova;


public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Filhote filhote = new Filhote();

        System.out.println("Cachorro:");
        cachorro.comer();
        cachorro.dormir();
        cachorro.latir();

        System.out.println("Filhote: ");

        filhote.comer();
        filhote.latir();
        filhote.seEsconder();
        System.out.println("Está escondido? "+filhote.isEscondido());
        filhote.dormir();
        System.out.println("Está escondido? "+filhote.isEscondido());





    }
}