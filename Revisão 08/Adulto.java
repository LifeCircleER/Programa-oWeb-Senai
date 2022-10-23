public class Adulto extends Cachorro{

    @Override
    public void latir() {
        System.out.println("AUF AUF");
    }

    @Override
    public void comer() {
        System.out.println("Comendo");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo");
    }
}
