package codewars.com.micky.katas;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
      int contador = 0;
      for (int i = 0; i < arrayOfSheeps.length; i++){
        if (arrayOfSheeps[i]){
           contador ++;
        }
      }
      return contador;  
    }
  }
  