package model;

public class Cliente {
    private String nome;
    private String email;
    private int pontosFidelidade;

    // Construtor para inicializar um cliente regular
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pontosFidelidade = 0; // Pontos iniciais são 0
    }

    // Métodos getters e setters
    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPontosFidelidade() {
        return this.pontosFidelidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    // Método para adicionar pontos
    public void adicionarPontos(double valorCompra) {
        int pontos = (int) valorCompra / 10; // 1 ponto para cada R$10
        this.pontosFidelidade += pontos;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Email: " + email + " | Pontos Fidelidade: " + pontosFidelidade;
    }
}
