package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnMayor{

  public static int getMayor(int[] array){
    int result = 0;
    for (int i = 0; i < array.length; i ++){
      if (array[i] > result){
        result = array[i];
      }
    }
    return result;
  }
}