public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    public String toSring() {
        return "Nome: " + nome + ", Idade: " + idade + ", Sexualidade: " + sexo + ", Experiencia: " + experiencia;
    }
}
