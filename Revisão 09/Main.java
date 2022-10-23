public class Main {
    public static void main(String[] args) {
        Lanchonete lanchonete = new Lanchonete();

        lanchonete.addSandwiche(lanchonete.fazDaCasa());
        lanchonete.addSandwiche(lanchonete.fazXBurguer());
        lanchonete.addSandwiche(lanchonete.fazXEgg());

        System.out.println("Sua conta e: "+lanchonete.fecharConta(lanchonete.conta));

    }
}
