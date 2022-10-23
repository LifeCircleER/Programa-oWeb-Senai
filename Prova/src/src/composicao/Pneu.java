package src.composicao;

public class Pneu {

    private String marca;

    public Pneu(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "marca='" + marca + '\'' +
                '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
