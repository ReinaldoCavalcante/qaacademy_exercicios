package medium;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {

        double i = 1, anterior = 0, numeroDigitado;

        while (i <= 5) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

            if (numeroDigitado < anterior || i == 1) {
                anterior = numeroDigitado;
            }

            i++;

        }

        System.out.println("O menor numero é " + anterior);

    }
}
