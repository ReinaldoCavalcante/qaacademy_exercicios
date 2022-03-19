package easy;

import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
      double salário, imposto = 0;
      
      salário =Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario"));
    

      if (salário > 0 && salário <= 1903.98) {
       System.out.println("Isento de Imposto de Renda");
      } 

      if (salário >= 1903.99 && salário <= 2826.65) {
        imposto = (salário * 0.074) - 142.80;
      } 
  	
       
      if (salário >=2826.66 && salário <= 3751.05) {
      imposto = (salário * 0.15) - 354.80;
      } 

      if (salário >= 3751.06 && salário <= 4664.68) {
        imposto = (salário * 0.225) - 636.13; 
      } 

      if (salário > 4664.69) {
        imposto = (salário * 0.275) - 869.36; 
      }

      System.out.println ("Salario Bruto:" + salário);
      System.out.println ("Salario Liquido" + (salário - imposto ));
      System.out.println ("Imposto a Pagar" + imposto );


    }
}
