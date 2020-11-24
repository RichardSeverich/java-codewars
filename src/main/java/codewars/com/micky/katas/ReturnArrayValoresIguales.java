package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnArrayValoresIguales{
  
  public static boolean getIguales(int[] array1, int[] array2){
    if (array1.length != array2.length){
      return false;
    }
    for (int i = 0; i < array1.length; i++){
      if (! existeEnArray(array2, array1[i])){
        return false;
      }
    }
    return true;
  }

  public static boolean existeEnArray(int[] array, int buscarElemento){
    for (int valor : array){
      if (valor == buscarElemento){
        return true;
      }
    }
    return false;
  }
}
