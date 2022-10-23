package src.adapter;

public class AdapterCaoDeGuarda extends Cachorro{

    CaoDeGuarda caoDeGuarda = new CaoDeGuarda();

    @Override
    public void latir() {
        System.out.println("Estou latindo");
    }

    @Override
    public void comer() {
        caoDeGuarda.alimentar(1);
    }

    @Override
    public void dormir() {
        caoDeGuarda.descansar(1);
    }
}
