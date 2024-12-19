package model;

public class Contato {
    private String nome;
    private String telefone;

    // Construtor
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // ToString
    @Override
    public String toString() {
        return "Nome: " + nome + " | Telefone: " + telefone;
    }
}
