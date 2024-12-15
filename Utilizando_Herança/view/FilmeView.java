package view;

import model.Conteudo;
import model.Filme;
import model.Serie;

public class FilmeView {
    public static void main(String[] args) {
        Filme p1 = new Filme("Norbet", 1.30, "Rasputia", 100000);
        Filme p2 = new Filme("Cidade de Deus", 1.59, "AK-47", 20000);

        Serie s1 = new Serie("Atlanta", 1.30, 30, 40);
        Serie s2 = new Serie("Atlanta", 1.30, 30, 40);

        p1.exibirInfo();
        p2.exibirInfo();

    }
    
}
