package model;

public class Computador {
    private Memoria memoria; // Atributo Memoria

    public Computador(String marca, String frequencia, String tipo, String capacidade) {
        this.memoria = new Memoria(marca, frequencia, tipo, capacidade);  // Cria uma memória
    }

    public void detalhes() {
        System.out.println("Marca: " + memoria.getProcessador().getMarca());
        System.out.println("Frequência: " + memoria.getProcessador().getFrequencia());
        System.out.println("Tipo: " + memoria.getTipo());
        System.out.println("Capacidade: " + memoria.getCapacidade());
    }
}
