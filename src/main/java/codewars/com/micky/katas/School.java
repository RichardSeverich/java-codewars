package codewars.com.micky.katas;

public class School{

    public static int getAverage(int[] marks){
       int resultado = 0;
   for (int i = 0; i < marks.length; i++){
     resultado = (resultado + marks[i]);
    }
   resultado = resultado / marks.length;
   return resultado ;
   }
}
