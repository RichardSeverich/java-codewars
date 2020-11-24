package codewars.com.micky.katas;

public class ReturnArrayMulty{

  public static int[] getMulty(int[] array1, int[] array2){
    int[] result = new int[array1.length];
    for (int i = 0; i < array1.length; i ++){
      result[i] = array1[i] * array2[i];
    }
    return result;
  }
}
