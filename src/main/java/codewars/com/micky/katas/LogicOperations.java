package codewars.com.micky.katas;

public class LogicOperations {

    public static boolean getAnd (int a, int b) {
        //return (a == 1) && (b == 1);
        boolean boolA = (a == 1); // Se vuelve true o false
        boolean boolB = (b == 1); // Se vuelve true o false
        return boolA && boolB;
    }

    public static boolean getOr (int a, int b) {
        boolean boolA = (a == 1); // vasta q uno sea true
        boolean boolB = (b == 1);
        return boolA || boolB;
    }

    public static boolean getNAnd (int a, int b) {
        boolean boolA = (a == 1); // NAND
        boolean boolB = (b == 1);
        return !(boolA && boolB);
    }

    public static boolean getNOr (int a, int b) {
        boolean boolA = (a == 1); // NOR
        boolean boolB = (b == 1);
        return !(boolA || boolB);
    }
}