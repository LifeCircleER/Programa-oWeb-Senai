public class Tecnico extends Aluno{

    private String registroProfissional;

    public void praticar(){
        System.out.println(this.getNome() + " esta praticando");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
