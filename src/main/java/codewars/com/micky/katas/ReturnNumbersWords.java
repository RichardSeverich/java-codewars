package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnNumbersWords {

  public static int returnNumber(String dato){
    int result = 0;
    for (int i = 0; i < dato.length(); i ++){
      if (Character.isDigit(dato.charAt(i))){
        result ++;
      }
    }
    return result;
  }
}