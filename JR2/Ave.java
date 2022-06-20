public class Ave extends Animal{

    private String corPena;


    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Carne");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Ave");
    }

    public void setAltura(float altura) {
        System.out.println(altura);
    }

    public void setPeso(double peso) {
        System.out.println(peso);
    }

    public void setIdade(int idade) {
        System.out.println(idade);
    }

    public void corPena(String corPena) {
        System.out.println(corPena);
    }
}
