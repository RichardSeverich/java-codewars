package codewars.com.micky.katas;

public class Impar {

    public static int oddCount(int n){
      int contador = 1;
      int resultado = 0;
      while (contador < n){
        if (contador % 2 != 0){
          resultado ++;
        }
        contador ++;
      }
      return resultado;
    }
  }
  