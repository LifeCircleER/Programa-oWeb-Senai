public class Main {
    public static void main(String[] args) {

        Cachorro filhote = new Filhote();
        Cachorro adulto = new Adulto();
        Cachorro caoDeGuarda = new AdapterCaoDeGuarda();

        filhote.comer();
        adulto.comer();
        caoDeGuarda.comer();

        filhote.latir();
        adulto.latir();
        caoDeGuarda.latir();

        filhote.dormir();
        adulto.dormir();
        caoDeGuarda.dormir();
    }
}
