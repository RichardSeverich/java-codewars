package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnPalabras {

    /**
    * Constructor.
    */
    private ReturnPalabras() {
    }

    /**
     * @param dato dato.
     * @return array.
     */
    public static int getDato(final String dato) {
        String[] array = dato.split(" ");
        return array.length;
    }
}
