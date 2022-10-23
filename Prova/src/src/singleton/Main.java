package src.singleton;

public class Main {
    public static void main(String[] args) {
        Registro registro = Registro.getRegistro();
        Registro registro1 = Registro.getRegistro();
        Registro registro2 = Registro.getRegistro();

    }
}
