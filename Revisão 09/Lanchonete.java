import java.util.ArrayList;

public class Lanchonete extends Factory {

    ArrayList<Sandwiche> conta = new ArrayList<>();

    private XBurguer xBurguer;
    private XEgg xEgg;
    private DaCasa daCasa;

    public XBurguer fazXBurguer() {
        return xBurguer = (XBurguer) super.getSandwiche(2);
    }

    public XEgg fazXEgg() {
        return xEgg = (XEgg) super.getSandwiche(1);
    }

    public DaCasa fazDaCasa() {
        return daCasa = (DaCasa) super.getSandwiche(3);
    }

    public double fecharConta(ArrayList<Sandwiche> conta) {
        double valorTotal = 0;
        for (Sandwiche e : conta) {
            valorTotal += e.getPreco();
        }
        return valorTotal;
    }

    public void addSandwiche(Sandwiche sandwiche) {
        conta.add(sandwiche);
        System.out.println("Sandwiche feito!");
    }
}