package codewars.com.micky.katas;

/**
 * Class.
 */
public final class ReturnVocales {

    /**
    * Constructor.
    */
    private ReturnVocales() {
    }

    /**
     * @param dato dato.
     * @return contador.
     */
    public static int getString(final String dato) {
        int contador = dato.length();
        for (int i = 0; i < dato.length(); i++) {
            if (Character.isDigit(dato.charAt(i))) {
                contador--;
            }
        }
        return contador;
    }
}
