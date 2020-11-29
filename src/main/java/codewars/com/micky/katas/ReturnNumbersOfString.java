package codewars.com.micky.katas;

/**
 * Class.
 */
public class ReturnNumbersOfString {

    /**
     * @param dato dato.
     * @return contador.
     */
    public static int getString(final String dato) {
        int contador = 0;
        // ArrayList<Character> lista = new ArrayList<>();
        for (int i = 0; i < dato.length(); i++) {
            if (Character.isDigit(dato.charAt(i))) {
                // lista.add(dato.charAt(i));
                contador++;
            }
        }
        /*
         * int contador= 0; String[] array = dato.split(""); for (int i = 0; i <
         * array.length; i++){ if (Character.isDigit(dato.charAt(i))){ contador ++; } }
         */
        return contador;
    }
}