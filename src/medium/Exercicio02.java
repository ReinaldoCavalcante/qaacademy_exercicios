package medium;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
       double valorInvestimento , taxaJuros = 0.05 , valorJuros , i = 1 , valorTotal ;

       valorInvestimento=Integer.parseInt(JOptionPane.showInputDialog(" Valor do Investimento"));
       valorTotal = valorInvestimento;


       while (i<=10) {
        valorTotal = (valorTotal * taxaJuros) + valorTotal;

        i++;

       }

        valorJuros = valorTotal - valorInvestimento;


        System.out.println ( "Você Investiu " + valorInvestimento);
        System.out.println ( " Rendeu " + valorJuros + " de juros");
        System.out.println ( " O valor total é " + valorTotal);


    }
}
