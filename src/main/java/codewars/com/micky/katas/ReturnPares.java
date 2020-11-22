package codewars.com.micky.katas;

public class ReturnPares{

  public static int getPares(int[] numero){
    int contador = 0;
    for (int i = 0; i < numero.length; i++){
      if (numero[i] % 2 == 0){
        contador ++;
      }
    }
    return contador;
  }
}
