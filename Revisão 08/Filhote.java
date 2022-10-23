public class Filhote extends Cachorro{

    public void latir() {
        System.out.println("AU AU");
    }

    @Override
    public void comer() {
        System.out.println("Comendo");
    }

    @Override
    public void dormir(){
        System.out.println("Dormindo");
    }
}
