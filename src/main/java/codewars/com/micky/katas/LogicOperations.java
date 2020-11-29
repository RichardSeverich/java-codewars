package codewars.com.micky.katas;

/**
 * Class.
 */
public class LogicOperations {

    /**
     * @param a a.
     * @param b b.
     * @return boolean.
     */
    public static boolean getAnd(final int a, final int b) {
        // return (a == 1) && (b == 1);
        boolean boolA = (a == 1); // Se vuelve true o false
        boolean boolB = (b == 1); // Se vuelve true o false
        return boolA && boolB;
    }

    /**
     * @param a a.
     * @param b b.
     * @return boolean.
     */
    public static boolean getOr(final int a, final int b) {
        boolean boolA = (a == 1); // vasta q uno sea true
        boolean boolB = (b == 1);
        return boolA || boolB;
    }

    /**
     * @param a a.
     * @param b b.
     * @return boolean.
     */
    public static boolean getNAnd(final int a, final int b) {
        boolean boolA = (a == 1); // NAND
        boolean boolB = (b == 1);
        return !(boolA && boolB);
    }

    /**
     * @param a a.
     * @param b b.
     * @return boolean.
     */
    public static boolean getNOr(final int a, final int b) {
        boolean boolA = (a == 1); // NOR
        boolean boolB = (b == 1);
        return !(boolA || boolB);
    }
}