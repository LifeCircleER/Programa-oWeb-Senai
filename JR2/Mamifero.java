public class Mamifero extends Animal {

    //Variaveis
    private String corPele;

    //Metodos
    @Override
    public void locomover() {
       System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Bebe Leite");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Mamifero");
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

    public void corPele(String corPele) {
    }
}
