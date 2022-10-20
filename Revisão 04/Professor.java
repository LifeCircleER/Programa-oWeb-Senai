public class Professor extends Pessoa{
    private String especialidade;
    private int salario;

    public void receberAumento(){
        this.salario++;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
