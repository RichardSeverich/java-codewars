package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnArrayMerged{

  public static int[] getArray(int[] array1, int[] array2){
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < array1.length; i ++){
      list.add(array1[i]);
    }
    for (int j = 0; j < array2.length; j ++){
      list.add(array2[j]);
    }
    int[] result = new int[list.size()];
    for (int z = 0; z < list.size(); z ++){
      result[z] = list.get(z);
    }
    return result;
  }
}