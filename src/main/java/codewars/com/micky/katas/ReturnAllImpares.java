package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnAllImpares {

  public static int[] getImpares(int[] array){
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < array.length; i ++){
      if (array[i] % 2 != 0){
        arrayList.add(array[i]);
      }
    }
    int[] result = new int[arrayList.size()];
    for (int i = 0; i < arrayList.size(); i++){
      result[i] = arrayList.get(i);
    }
    return result;
  }
}
