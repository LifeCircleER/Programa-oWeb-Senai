public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }


    @Override
    public void play() {
       this.reproduzindo = true;
    }

    @Override
    public void pause() {
      this.reproduzindo = false;
    }

    @Override
    public void like() {
       this.curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getViews() {
        return views;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Avaliacao = " + avaliacao + ", Curtidas = " + curtidas + ", Views = " + views + ", Reproduzindo = " + reproduzindo;
    }
}

