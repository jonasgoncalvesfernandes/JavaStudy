package model;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    // Construtor
    public Agenda() {
        contatos = new ArrayList<>();
    }

    // Cadastrar contato
    public void Cadastrar_Contato(String nome, String telefone) {
        Contato novoCTT = new Contato(nome, telefone);
        contatos.add(novoCTT);
    }

    // Listar contatos
    public void Listar_Contatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    // Buscar contato por telefone
    public Contato Buscar_porTelefone(String telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals(telefone)) {
                return contato;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Remover contato
    public boolean Remover_Contato(String telefone) {
        Contato contato = Buscar_porTelefone(telefone);
        if (contato != null) {
            contatos.remove(contato);
            return true; // Contato removido com sucesso
        }
        return false; // Não encontrou o contato para remover
    }

    // Quantidade de contatos
    public int Quantidade_contatos() {
        return contatos.size();
    }
}
