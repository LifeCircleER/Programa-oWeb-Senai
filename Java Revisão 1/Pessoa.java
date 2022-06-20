public class Pessoa extends Coracao{

    //variaveis
    private String nome;

    public String getNome() {
        return nome;
    }

    //Entrada de Dados pela classe Main
    public void setNome(String nome) {
        this.nome = nome;
        System.out.println(nome);
    }
}
