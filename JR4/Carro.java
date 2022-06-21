public class Carro extends Meios_de_Transporte {

    //variaveis
    private String nomeC = "Onix";

    //Metodos
    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC() {
        this.nomeC = nomeC;
        System.out.println(nomeC);
    }

    @Override
    public void velocidade() {
        System.out.println(120 + " kilometros por hora.");
    }

    public void setTamanho(float tamanho) {
        System.out.println("Possui: " + tamanho + " metros no total.");
    }

    public void setPeso(int peso) {
        System.out.println("Possui: " + peso + " toneladas no total.");
    }
}
