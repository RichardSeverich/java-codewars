package codewars.com.charly;

/**
identificar si el numero es primo
en en metodo con recursividad enviar el 2 como divisor para empezar
 */
public class PrimeNumber {

  public static boolean prime(int numero){
    numero = Math.abs(numero);
      if (numero == 1){
       return false;
      }
    int contador = 2;
    boolean primo=true;
    while ((primo) && (contador!=numero)){
      if (numero % contador == 0){
        primo = false;
      }
      contador++;
    }
    return primo;
  }

  public static boolean primeRecursion(int num, int divisor){
    num = Math.abs(num);
    if (num == 0 || num == 1){
      return false;
    }else if(num/2 < divisor){
      return true;
    } else if(num%divisor==0){
      return false;
    }
    return primeRecursion(num, divisor+1);
  }
}
