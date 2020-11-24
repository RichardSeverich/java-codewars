package codewars.com.micky.katas;

public class ReturnSumaArray{
  
  public static int getSumaArray(int[] array1){
    int result = 0;
    for (int i = 0; i < array1.length; i ++){
      result += array1[i];
    }
    return result;
  }
}