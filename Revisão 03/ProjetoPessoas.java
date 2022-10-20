public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p2.setNome("Joao");
        p3.setNome("Antetegemon");
        p4.setNome("Altair");

        p2.setIdade(15);
        p3.setIdade(28);
        p4.setIdade(47);

        p2.setSexo('M');
        p3.setSexo('I');
        p4.setSexo('M');

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
