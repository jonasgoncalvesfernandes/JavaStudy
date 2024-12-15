package model;

public class Filme extends Conteudo {
    private String diretor;
    private double orcamento;

    public Filme(String titulo, double duracao, String diretor, double orcamento) {
        super(titulo, duracao);
        this.diretor = diretor;
        this.orcamento = orcamento;
    }

    public void exibirInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Orçamento: R$ " + getOrcamento());
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }
}
