package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnVocales {

  public static int getString(String dato){
    int contador = dato.length();
    for(int i = 0; i< dato.length(); i ++){
        if(Character.isDigit(dato.charAt(i)))
        contador--;
    }  
    return contador;
  }
}
