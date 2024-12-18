package model;



public class Serie extends Conteudo {
    private int temporadas;
    private int episodiosPorTemporada;

    public Serie(String titulo, double duracao,int temporadas, int episodiosPorTemporada) {
        super(titulo, duracao);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    
    public int getTemporadas() {
        return temporadas;  
    }

    public int setTemporada(int temporadas) {
        return this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int setEpisodiosPorTemporada(int episodiosPorTemporada) {
        return this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void exibirInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Episodios: " + getEpisodiosPorTemporada());
    }
}
