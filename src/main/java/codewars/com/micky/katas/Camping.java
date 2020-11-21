package codewars.com.micky.katas;

public class Camping {
  
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
      // Your code here!
      if ((mpg * fuelLeft) == distanceToPump){
        return true;
      } else {
        return false;
      } 
    }
  }
  