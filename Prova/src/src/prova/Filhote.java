package src.prova;

public class Filhote extends Cachorro{
    private boolean escondido;

    public boolean isEscondido() {
        return escondido;
    }

    private void brincar(){
        System.out.println("Estou brincando");
    }
    public void seEsconder(){
        escondido = true;
    }

    @Override
    public void comer() {
        brincar();
    }

    @Override
    public void dormir(){
        escondido = false;
    }
}
