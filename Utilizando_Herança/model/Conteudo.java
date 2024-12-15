package model;

public class Conteudo {
    private String titulo;
    private double duracao;

    public Conteudo(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    //get retorna valor
    public String getTitulo(){
        return titulo;
    }

    //set altera o valor da variavel
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao(){
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    }
/*
 * public class Gerente extends Funcionario {
 * private int qtdeProjetos;
 * public Gerente(String nome, double salario, int qtdeProjetos) {
 * super(nome, salario);
 * th
 */