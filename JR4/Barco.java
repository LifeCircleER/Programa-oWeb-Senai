public class Barco extends Meios_de_Transporte {

    //variaveis
    private String nomeB = "Savero";

    //Metodos
    public String getNomeB() {
        return nomeB;
    }

    public void setNomeB() {
        this.nomeB = nomeB;
        System.out.println(nomeB);
    }

    @Override
    public void velocidade() {
        System.out.println(100 + " kilometros por hora.");
    }

    public void setTamanho(float tamanho) {
        System.out.println("Possui: " + tamanho + " metros no total.");
    }

    public void setPeso(int peso) {
        System.out.println("Possui: " + peso + " toneladas no total.");
    }
}
