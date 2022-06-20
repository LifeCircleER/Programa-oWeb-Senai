public class Main {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setAltura(5.22f);
        m.setPeso(100.00d);
        m.setIdade(10);
        m.alimentar();
        m.locomover();
        m.emitirsom();
        m.corPele("Marron");

        r.setAltura(0.95f);
        r.setPeso(10.00d);
        r.setIdade(4);
        r.alimentar();
        r.locomover();
        r.emitirsom();
        r.corEscamaR("Verde");

        p.setAltura(0.50f);
        p.setPeso(0.700d);
        p.setIdade(1);
        p.alimentar();
        p.locomover();
        p.emitirsom();
        p.corEscamaP("Cinza");

        a.setAltura(1.65f);
        a.setPeso(3.00d);
        a.setIdade(2);
        a.alimentar();
        a.locomover();
        a.emitirsom();
        a.corPena("Branca");


    }
}
