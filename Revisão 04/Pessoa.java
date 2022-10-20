public abstract class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public void fazerAniversario(){
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
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

    @Override
    public String toString() {
        return nome + idade + sexo;
    }
}
