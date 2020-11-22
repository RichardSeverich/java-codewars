package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnMayor{

  public static int getMayor(int[] array){
    int result = 0;
    for (int i = 0; i < array.length - 1; i ++){
      int comparar = array[i + 1];
      if(array[i] < comparar){
        result = comparar;
      }
    }
    return result;
  }
}