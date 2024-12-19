package model;

public class Memoria {
    private String tipo;
    private String capacidade;
    private Processador processador;  // Composição com Processador

    public Memoria(String marca, String frequencia, String tipo, String capacidade) {
        this.processador = new Processador(marca, frequencia); // Cria um processador
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    // Métodos get e set
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getCapacidade() {
        return this.capacidade;
    }

    // Acesso ao Processador
    public Processador getProcessador() {
        return processador;
    }
}
