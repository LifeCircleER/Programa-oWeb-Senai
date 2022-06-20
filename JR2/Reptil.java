public class Reptil extends Animal {

    //Variaveis
    private String corEscamaR;

    //Metodos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Reptil");
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

    public void corEscamaR(String corEscamaR) {
        System.out.println(corEscamaR);
    }
}
