public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Filhote filhote = new Filhote();

        System.out.println("Cachorro");
        cachorro.comer();
        cachorro.dormir();
        cachorro.latir();

        System.out.println("Filhotes");
        filhote.comer();
        filhote.seEsconder();
        filhote.latir();
        System.out.println("Esta Escondido? " + filhote.getEscondido());
        filhote.dormir();
        System.out.println("Esta Escondido? " + filhote.getEscondido());
    }
}
