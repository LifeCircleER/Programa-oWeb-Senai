public class Aviao extends Meios_de_Transporte {

    //variaveis
    private String nomeA = "PT75836";

    //Metodos
    public String getNomeA() {
        return nomeA;
    }

    public void setNomeA() {
        System.out.println(nomeA);
    }

    @Override
    public void velocidade() {
        System.out.println(250 + " kilometros por hora.");
    }

    public void setTamanho(float tamanho) {
        System.out.println("Possui: " + tamanho + " metros no total.");
    }

    public void setPeso(int peso) {
        System.out.println("Possui: " + peso + " toneladas no total.");
    }
}
