package codewars.com.micky.katas;

public class ReverseWords{

    public static String reverseWords(String str){
   
      String result = "";
      String[] array = str.split(" ");
   
      for (int i = array.length -1; i >= 0;i--){
        if (i == 0){
          result += array[i];
        } else {
          result += array[i] + " ";
        }
      }
      return result;
    }
   }
   