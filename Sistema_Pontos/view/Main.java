package view;

import model.Cliente;
import model.ClientePremium;

public class Main {

    public static void main(String[] args) {
        // Criando clientes regulares e premium
        Cliente c1 = new Cliente("Jonas", "jonas@gmail.com");
        ClientePremium c2 = new ClientePremium("Jailson", "jailson@ifsp.com");

        // Simulando compras e adicionando pontos
        c1.adicionarPontos(100); // Cliente regular compra de R$100 (10 pontos)
        c2.adicionarPontos(1000); // Cliente premium compra de R$100 (20 pontos)

        // Concedendo bônus de aniversário para o cliente premium
        c2.concederBonusAniversario();

        // Exibindo os detalhes dos clientes
        System.out.println(c1); // Deve exibir: 10 pontos
        System.out.println(c2); // Deve exibir: 120 pontos (20 pontos da compra + 100 de bônus)
    }
}
