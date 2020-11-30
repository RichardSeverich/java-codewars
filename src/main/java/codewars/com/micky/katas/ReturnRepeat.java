package codewars.com.micky.katas;

/**
 * Class.
 */
public class ReturnRepeat {

    /**
     * @param array array.
     * @return array.
     */
    public static String getRepeat(final String[] array) {
        int indexMayor = 0;
        int contadorActual = 0;
        int contadorAnterior = 0;
        String valid = "";
        for (int i = 0; i < array.length; i++) {
            if (!valid.contains(array[i])) {
                contadorActual = contarRepetidos(array, array[i]);
                if (contadorActual > contadorAnterior) {
                    contadorAnterior = contadorActual;
                    indexMayor = i;
                }
                valid = valid + array[i];
            }
        }
        return array[indexMayor];
    }

    /**
     * @param array  array.
     * @param buscar buscar.
     * @return contador.
     */
    public static int contarRepetidos(final String[] array, final String buscar) {
        int contador = 0;
        for (String valor : array) {
            if (buscar.equalsIgnoreCase(valor)) {
                contador++;
            }
        }
        return contador;
    }
}
