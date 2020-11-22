package codewars.com.micky.katas;

public class ReturnImpares{

  public static int getImpares(int[] numero){
    int contador = 0;
    for (int i = 0; i < numero.length; i++){
      if (numero[i] % 2 != 0){
        contador ++;
      }
    }
    return contador;
  }
}
