package ExerciciosMetodosComRetorno;

public class Exercicio01 {
    public static void main(String[] args) {
        String gasolina = precoDaGasolina();
        System.out.println(gasolina);

        String greve = greveDosCaminhoneiros();
        System.out.println(greve);

    }

    public static String precoDaGasolina() {
        Double preço = 8.00;
        if (preço <= 5) {
            return "Preço Adequado " + (preço);

        } else {
            return "Preço Abusivo " + (preço);
        }

    }

    public static String greveDosCaminhoneiros() {
        Double preçoAtual = 7.50;
        if (preçoAtual > 7.00) {
            return " Haverá greve dos Caminhoneiros " + preçoAtual;

        } else {
            return " Não havera greve" + preçoAtual;

        }
    }

}
