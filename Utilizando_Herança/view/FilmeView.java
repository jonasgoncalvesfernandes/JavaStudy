package view;

import model.Conteudo;
import model.Filme;
import model.Serie;

import java.util.*;

public class FilmeView {
    public static void main(String[] args) {
        Filme p1 = new Filme("Norbet", 1.30, "Rasputia", 100000);
        Filme p2 = new Filme("Cidade de Deus", 1.59, "AK-47", 20000);

        Serie s1 = new Serie("Breaking Bad", 90, 30, 40);
        Serie s2 = new Serie("Atlanta", 80, 30, 40);

        p1.exibirInfo();
        System.err.println();
        p2.exibirInfo();
        System.err.println();
        s1.exibirInfo();
        System.err.println();
        s2.exibirInfo();

    }
    
}
