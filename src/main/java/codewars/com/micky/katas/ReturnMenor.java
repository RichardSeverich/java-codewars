package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnMenor{

  public static int getMenor(int[] array){
    int result = array[0];
    for (int i = 0; i < array.length; i ++){
      if(array[i] < result){
        result = array[i];
      }
    }
    return result;
  }
}