package codewars.com.micky.algoritmosbusqueda;

/**
 * Class.
 */
public final class Secuencial {

    /**
     * Constructor.
     */
    private Secuencial() {
    }

    /**
     * @param arr arr.
     * @param datoBuscar datoBuscar.
     * @return String.
     */
    public static String setSecuencial(final int[] arr, final int datoBuscar) {
        int contador = 0;
        boolean bandera = false;
        while (contador < arr.length && bandera == false) {
            if (datoBuscar == arr[contador]) {
                bandera = true;
            }
            contador++;
        }
        if (bandera) {
            return "el elemento ha sido encontrado en la posicion " + (contador - 1);
        } else {
            return "el elemento no se encuentra en el array";
        }
    }
}
