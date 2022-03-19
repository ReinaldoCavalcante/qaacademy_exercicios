package ExercicioInstancia;

public class ExecucaoInstancia {
    public static void main(String[] args) {
        
     
     ExercicioInstancia exemplo = new ExercicioInstancia();
     System.out.println (exemplo.carros("celta ", "gol"));
     System.out.println(exemplo.fruta("uva ", "maça"));
     exemplo.nomes("Reinaldo", "matheus");
     
     System.out.println(exemplo.idade);
     System.out.println(exemplo.nome);

    }
}
