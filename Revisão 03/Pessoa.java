public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void fazerAniv(){

    }
    @Override
    public String toString() {
        return "Pessoa =" + " nome = " + nome + ", idade = " + idade + ", sexo = " + sexo;
    }
}