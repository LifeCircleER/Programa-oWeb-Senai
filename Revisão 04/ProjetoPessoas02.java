public class ProjetoPessoas02 {
    public static void main(String[] args) {

        Aluno p1 = new Aluno();
        Visitante p2 = new Visitante();
        Professor p3 = new Professor();
        Bolsista p4 = new Bolsista();
        Tecnico p5 = new Tecnico();

        p1.setNome("Claudio");
        p4.setNome("Evan");

        p5.getRegistroProfissional();
        p5.praticar();

        p1.pagarMensalidade();
        p4.pagarMensalidade();
    }
}
