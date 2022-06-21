public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        Barco b = new Barco();
        Aviao a = new Aviao();
        Elevador e = new Elevador();

        a.setNomeA();
        a.setTamanho(22.4f);
        a.setPeso(200);
        a.velocidade();

        b.setNomeB();
        b.setTamanho(2.1f);
        b.setPeso(110);
        b.velocidade();

        c.setNomeC();
        c.setTamanho(1.9f);
        c.setPeso(160);
        c.velocidade();

        e.setNomeE();
        e.setTamanho(2.9f);
        e.setPeso(350);
        e.velocidade();

        System.exit(0);
    }
}
