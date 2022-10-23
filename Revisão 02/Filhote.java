public class Filhote extends Cachorro{
    private boolean escondido;

    public boolean getEscondido() {
        return escondido;
    }

    public void setEscondido(boolean escondido) {
        this.escondido = escondido;
    }

    private void brincar(){
        System.out.println("Brincando");
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
