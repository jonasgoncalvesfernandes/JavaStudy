package model;

public class Processador {
    private String marca;
    private String frequencia;

    // Construtor
    public Processador(String marca, String frequencia) {
        this.marca = marca;
        this.frequencia = frequencia;
    }

    // Métodos get e set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return this.frequencia;
    }
}
