public class Peixe extends Animal {
    //Variaveis
    private String corEscamaP;

    //Metodos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Alga");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Peixe");
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

    public void corEscamaP(String corEscamaP) {
        System.out.println(corEscamaP);
    }
}
