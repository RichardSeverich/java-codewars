package codewars.com.micky.katas;

import java.util.ArrayList;

public class CodeWarsKata {
  public static int[] take(int[] arr, int n) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i ++){
      list.add(arr[i]);
    }
    int[] result = new int[list.size()];
    for (int j = 0; j < list.size(); j++){
      result[j] = list.get(j);
    }
    return result;
  }
}
