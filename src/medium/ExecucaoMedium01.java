package medium;

public class ExecucaoMedium01 {
    public static void main(String[] args) {
        
        Exercicio01 exercicio01 = new Exercicio01(); 
        String [] vetorParImpar = exercicio01.verificarNumerosParImpar(); 
        exibirVetor(vetorParImpar);
        exibirVetor(exercicio01.verificarNumerosParImpar());


    }

    private static void exibirVetor(String[] verificarNumerosParImpar) {
    }
}
