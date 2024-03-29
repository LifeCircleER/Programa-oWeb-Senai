public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public String getLogin() {
        return login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    @Override
    public String toString(){
        return super.toString() + login;
    }
}
