package easy;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        double salario,inss;

        salario=Integer.parseInt(JOptionPane.showInputDialog("salario"));

        if (salario<=1045.00) {
        inss= salario*0.075;
        System.out.println("o valor do inss sera "+ inss);
        }

        if (salario>=1045.00 && salario <=2089.60) {
            inss= salario*0.09;
            System.out.println("o valor do inss sera "+ inss);
            }

            if (salario>=2089.61 && salario <=3134.40) {
                inss= salario*0.12;
                System.out.println("o valor do inss sera "+ inss);
                }

                if (salario>=3134.41 && salario <=6101.06) {
                    inss= salario*0.14;
                    System.out.println("o valor do inss sera "+ inss);
                    }

                    if (salario>=6101.07) {
                        inss=854.15;
                        System.out.println("o valor do inss sera "+ inss);
                        }
            
    }
}
