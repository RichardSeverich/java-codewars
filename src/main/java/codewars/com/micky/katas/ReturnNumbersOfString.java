package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnNumbersOfString {

    /**
    * Constructor.
    */
    private ReturnNumbersOfString() {
    }

    /**
     * @param dato dato.
     * @return contador.
     */
    public static int getString(final String dato) {
        int contador = 0;
        for (int i = 0; i < dato.length(); i++) {
            if (Character.isDigit(dato.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
}
