public class Coracao {

    //variaveis
     private String coracao;
     private int batimentos;

     //Entrada de Dados pela classe Main
    public void setCoracao(String coracao) {
        this.coracao = coracao;
        System.out.print(coracao);
    }

    public void setBatimentos(int batimentos) {
        this.batimentos = batimentos;
        System.out.println(batimentos + " vezes por segundo.");
    }
}


