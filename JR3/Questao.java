public class Questao {
    private String text;
    private int peso;

    public String getText() {
        return text;
    }

    public int getPeso() {
        return peso;
    }

    public void setText(String text) {
        System.out.println(text);
    }

    public void setPeso(int peso) {
        System.out.println("Possui: " + peso + " kilos.");
    }

}
