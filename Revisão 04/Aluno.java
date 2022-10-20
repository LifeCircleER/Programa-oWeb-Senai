public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.getNome());
    }

}
