public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudaTrabalho(){
        this.trabalhando =! this.trabalhando;
    }
}
