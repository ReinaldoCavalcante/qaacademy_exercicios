package easy;


public class Exercicio06 {

    public String verificaAprovacao(double nota1, double nota2) {
        double resultado;
        resultado = (nota1 + nota2) / 2;
        if (resultado > 5) {
            return "Aprovado";}

            if (resultado < 5) {
                return ("Reprovado");
            }

            if (resultado == 5) {
                return ("Exame");
            }

            return "Não foi possível calcular sua nota";

        }
    }