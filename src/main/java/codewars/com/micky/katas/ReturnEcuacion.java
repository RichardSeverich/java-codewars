package codewars.com.micky.katas;

public class ReturnEcuacion{
  public static double getEcuacion(double a, double b, double c){
    double result = 0;
    result = Math.sqrt(Math.pow(b, 2)-(4 * a * c));
    result = - b + result;
    result = result / (2 * a);
    return result;
  }
}