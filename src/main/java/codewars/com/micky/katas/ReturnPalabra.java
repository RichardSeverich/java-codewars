package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnPalabra {

    /**
    * Constructor.
    */
    private ReturnPalabra() {
    }

    /**
     * @param dato dato.
     * @return array.
     */
    public static int palabras(final String dato) {
        String[] array = dato.split(" ");
        return array.length;
    }
}
