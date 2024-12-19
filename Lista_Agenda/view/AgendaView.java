package view;

import model.Agenda;

import java.util.Scanner;

public class AgendaView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        // Cadastrar alguns contatos
        agenda.Cadastrar_Contato("Jonas", "40028922");
        agenda.Cadastrar_Contato("Tigrinho", "190");

        // Exibir lista de contatos
        System.out.println("Lista de contatos:");
        agenda.Listar_Contatos();

        // Exibir quantidade de contatos
        System.out.println("Quantidade de contatos: " + agenda.Quantidade_contatos());

        // Buscar contato por telefone
        System.out.println("\nBuscando pelo telefone '40028922':");
        if (agenda.Buscar_porTelefone("40028922") != null) {
            System.out.println("Contato encontrado: " + agenda.Buscar_porTelefone("40028922"));
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Remover um contato
        System.out.println("\nRemovendo o contato com telefone '190'.");
        if (agenda.Remover_Contato("190")) {
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Exibir lista de contatos após remoção
        System.out.println("\nLista de contatos após remoção:");
        agenda.Listar_Contatos();
        
        scanner.close();
    }
}
