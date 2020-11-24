package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnPalabra{

  public static int palabras(String dato){
    String[] array = dato.split(" ");  
    return array.length;
  }
}