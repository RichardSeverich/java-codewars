package codewars.com.micky.katas;

public class ReturnPrimo{
  
  //No Recursividad
  public static boolean getPrimo(int num){
    boolean primo = true;
    int index = 2;
    do {
      if (num % index == 0){
        primo = false;
      }
      index ++;
    } while ((primo) && (num != index));
    return primo;
  }

  //Recursividad
  public static boolean getPrimoRecur(int num, int div){
    if ((num == 1) || (num == 0)){
      return false;
    } else if (num / 2 < div){
      return true;
    } else if (num % div == 0){
      return false;
    }
    return ReturnPrimo.getPrimoRecur(num, div +1);
  }
}
