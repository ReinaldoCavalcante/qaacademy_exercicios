package easy;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        int numeroDigitado, i = 1;

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog ("Digite um Numero"));

       while(i <= 10) {
        System.out.println(numeroDigitado * i);
        i++;
        }


    }
}
