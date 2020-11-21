package codewars.com.micky.katas;

import java.util.ArrayList;

public class ReturnNumbersOfString {

  public static int getString(String dato){
    int contador = 0;
    //ArrayList<Character> lista = new ArrayList<>();
    for(int i = 0; i< dato.length(); i ++){
        if(Character.isDigit(dato.charAt(i)))
            //lista.add(dato.charAt(i));
            contador++;
    }
    /*int contador= 0;
    String[] array = dato.split("");
    for (int i = 0; i < array.length; i++){
      if (Character.isDigit(dato.charAt(i))){
        contador ++;
      }
    }*/
    
    return contador;

  }
}