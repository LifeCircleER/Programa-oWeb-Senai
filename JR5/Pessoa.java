public class Pessoa extends Coracao{

    //variaveis
    private String nome;

    //Metodos
    String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Meu nome e: " + nome + ".");
    }

    public void batimentos() {
        System.out.println("Meu coracao bate: " + 2 + " por segundo.");
    }
}