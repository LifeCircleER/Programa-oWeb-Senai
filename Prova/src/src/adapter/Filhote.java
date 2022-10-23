package src.adapter;

public class Filhote extends Cachorro{

    @Override
    public void latir() {
        System.out.println("Estou latindo");
    }

    @Override
    public void comer() {
        System.out.println("Estou comendo");
    }

    @Override
    public void dormir() {
        System.out.println("Estou dormindo");
    }
}
