package easy;



public class Exercicio09 {
        

   public int [] vetorTabuada ( int numeroDigitado){
  
    int vetorTabuada[] = new int [10] ;

   int i=1;
   while(i <= 10) {
    vetorTabuada [i - 1] = numeroDigitado * i;
    i ++;

   }
    return vetorTabuada;

}

}
    
    

    
    
    
    //int numeroDigitado, i = 1;

       // numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog ("Digite um Numero"));

      // while(i <= 10) {
      //  System.out.println(numeroDigitado * i);
      //  i++;
      //  }


    

