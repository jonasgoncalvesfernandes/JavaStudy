package view;

import model.Computador;

public class ProcessadorView {
    public static void main(String[] args) {
        Computador c1 = new Computador("Intel", "5.1 GHz", "DDR4", "16 GB");

        c1.detalhes(); // Exibe os detalhes do computador
    }
}
