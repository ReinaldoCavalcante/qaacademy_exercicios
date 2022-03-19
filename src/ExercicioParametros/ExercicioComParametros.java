package ExercicioParametros;

public class ExercicioComParametros {


    public void nomes (String nomeUm , String nomeDois){
    System.out.println(nomeUm);
    System.out.println(nomeDois);
    }

   public void numeros ( String primeiro, String segundo , String terceiro){
    System.out.println(primeiro);
    System.out.println(segundo);
    System.out.println(terceiro);
   }

   public  void frutas ( String frutaUm, String frutaDois , String frutaTres){
    System.out.println(frutaUm);
    System.out.println(frutaDois);
    System.out.println(frutaTres);
}

public  void diasDaSemana ( String diaUm, String diaDois , String diaTres, String diaQuatro, String diaCinco){
    System.out.println(diaUm);
    System.out.println(diaDois);
    System.out.println(diaTres);
    System.out.println(diaQuatro);
    System.out.println(diaCinco);
}

public  void notas ( String notaMaior , String notaMenor){
    System.out.println(notaMaior);
    System.out.println(notaMenor);
}


public  String carros ( String carroUm, String carroDois){
 String carros = carroUm + carroDois;
 return carros;
}


public  String nome( String nomeUm, String nomeDois){
    String nome = nomeUm + nomeDois;
    return nome;
}

public  String chocolates( String chocolateUm, String chocolateDois){
    String chocolates = chocolateUm + chocolateDois;
    return chocolates;
}

public  String marcas( String marcaUm, String marcaDois){
    String marcas = marcaUm + marcaDois;
    return marcas;
    }

    public  String numero( String primeiro, String segundo){
        String numero = primeiro + segundo;
     return numero;
}

}