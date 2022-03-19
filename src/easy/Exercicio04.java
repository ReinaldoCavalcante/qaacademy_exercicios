package easy;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero;
        int resultado;
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        resultado=numero*2;
        System.out.println("O numero vezes dois é " + resultado);

    }
}
