public class ProjetoYouTube {
    public static void main(String[] args) {
        Video p1[] = new Video[3];
        p1[0] = new Video("Aula 01");
        p1[1] = new Video("Aula 02");
        p1[2] = new Video("Aula 03");

        System.out.println(p1[0].toString());

        Gafanhoto p2[] = new Gafanhoto[2];
        p2[0] = new Gafanhoto("Jajones", 22, "M", "Apollyon");
        p2[1] = new Gafanhoto("Oooooo my god", 31, "I", "Negao");

        System.out.println(p2[1].toSring());

    }
}
