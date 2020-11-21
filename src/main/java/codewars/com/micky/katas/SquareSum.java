package codewars.com.micky.katas;

public class SquareSum{

    public static int squareSum(int[] n){
  
      double resultado = 0;
      double result = 0;
  
      for (int i = 0; i < n.length; i ++){
        result = Math.pow(n[i], 2);
        resultado += result;
      }
      return (int)resultado;
    }
  }
  