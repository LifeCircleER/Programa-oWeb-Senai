package src.adapter;

public class Main {
    public static void main(String[] args) {
    Cachorro filhote = new Filhote();
    Cachorro adulto = new Adulto();
    Cachorro caoDeGuarda = new AdapterCaoDeGuarda();

    filhote.comer();
    adulto.comer();
    caoDeGuarda.comer();

    filhote.dormir();
    adulto.dormir();
    caoDeGuarda.dormir();

    }
}
