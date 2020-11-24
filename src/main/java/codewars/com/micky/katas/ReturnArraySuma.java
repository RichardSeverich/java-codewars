package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnArraySuma{

  public static int[] getSumaArrays(int[] array1, int[] array2){
    int[] resultado = new int[array1.length];
    for (int i = 0; i < array1.length; i ++){
      resultado [i] = array1[i] + array2[i];
    }
    return resultado;
  }
}
