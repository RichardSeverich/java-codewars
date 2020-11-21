package codewars.com.micky.katas;

public class ReverseWords{

    public static String reverseWords(String str){
   
      String result = "";
      String[] array = str.split(" ");
   
      for (int i = array.length; i > 0; i--){
        /*if (i == 0){
          result += array[i];
        } else {
          result += array[i] + " ";
        }*/
        result += (i == 1)? array[i - 1]: array[i - 1] + " ";
      }
      return result;
    }
   }
