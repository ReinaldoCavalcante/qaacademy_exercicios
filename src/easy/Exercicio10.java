package easy;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        double investimento,taxaJuros,valorJuros,valorTotal;
      
     investimento=Integer.parseInt(JOptionPane.showInputDialog("investimento"));
     taxaJuros = 0.05 * 10;
     valorJuros = investimento * taxaJuros;
     valorTotal = valorJuros + investimento;

     System.out.println("Você Ivestiu " + investimento);
     System.out.println("Rendeu " + valorJuros +" de juros");
     System.out.println("O valor total são " + valorTotal);


    }
}
