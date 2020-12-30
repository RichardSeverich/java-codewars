package codewars.com.micky.katas;

/**
 * Class.
 */
public final class Camping {

    /**
    * Constructor.
    */
    private Camping() {
    }

    /**
     * @param distanceToPump distanceToPump.
     * @param mpg            mpg.
     * @param fuelLeft       fuelLeft.
     * @return boolean.
     */
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        if ((mpg * fuelLeft) == distanceToPump) {
            return true;
        } else {
            return false;
        }
    }
}
