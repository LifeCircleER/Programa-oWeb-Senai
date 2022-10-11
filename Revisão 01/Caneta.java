public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public void tampar() {
      this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public Caneta(String m, String c, float p){
        this.setModelo(m);
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }

    public void status() {
        System.out.println("Sobre a caneta");
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Cor " + this.cor);
        System.out.println("Tampada " + this.tampada);
    }

}
