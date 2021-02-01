package codewars.com.micky.algoritmosbusqueda;

/**
 * Class.
 */
public final class Binario {

    /**
     * Constructor.
     */
    private Binario() {
    }

    /**
     * @param arr arr.
     * @param datoBuscar datoBuscar.
     * @return String.
     */
    public static String setBinario(final int[] arr, final int datoBuscar) {
        int inferior = 0;
        int superior = arr.length;
        int mitad = (inferior + superior) / 2;
        boolean bandera = false;

        while (inferior < superior) {
            if (arr[mitad] == datoBuscar) {
                bandera = true;
                break;
            } else if (arr[mitad] > datoBuscar) {
                superior = mitad;
                mitad = (inferior + superior) / 2;
            } else if (arr[mitad] < datoBuscar) {
                inferior = mitad;
                mitad = (inferior + superior) / 2;
            }
        }
        if (bandera) {
            return "el elemento ha sido encontrado en la posicion " + mitad;
        } else {
            return "el elemento no se encuentra en el array";
        }
    }
}
