package easy;

public class ExecucaoEx09 {
    public static void main(String[] args) {
        
        Exercicio09 exercicio09 = new Exercicio09();
        int[] vetorTabuada = exercicio09.vetorTabuada(10);
        exibirVetor(vetorTabuada);
    }

    public static void exibirVetor(int[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
}

}