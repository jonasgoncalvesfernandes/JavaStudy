package model;

public class ClientePremium extends Cliente {

    public ClientePremium(String nome, String email) {
        super(nome, email); // Chama o construtor da classe base Cliente
    }

    // Sobrescreve o método adicionarPontos para clientes premium ganharem o dobro de pontos
    @Override
    public void adicionarPontos(double valorCompra) {
        int pontos = (int) valorCompra / 5; // 2 pontos para cada R$10
        this.setPontosFidelidade(this.getPontosFidelidade() + pontos);
    }

    // Método para conceder bônus de aniversário (100 pontos extras)
    public void concederBonusAniversario() {
        this.setPontosFidelidade(this.getPontosFidelidade() + 100);
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Premium";
    }
}
