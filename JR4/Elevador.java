public class Elevador extends Meios_de_Transporte {

    //variaveis
    private String nomeE = "355Oitis";

    //Metodos
    public String getNomeE() {
        return nomeE;
    }

    public void setNomeE() {
        this.nomeE = nomeE;
        System.out.println(nomeE);
    }

    @Override
    public void velocidade() {
        System.out.println(3 + " kilometros por hora.");
    }

    public void setTamanho(float tamanho) {
        System.out.println("Possui: " + tamanho + " metros no total.");
    }

    public void setPeso(int peso) {
        System.out.println("Possui: " + peso + " toneladas no total.");
    }
}
