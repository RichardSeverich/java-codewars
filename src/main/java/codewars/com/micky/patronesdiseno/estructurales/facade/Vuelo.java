package codewars.com.micky.patronesdiseno.estructurales.facade;

/**
 * Class.
 */
public class Vuelo {

    /**
    * Constructor.
    */
    public Vuelo() {
    }

    /**
     * @param fechaIda fechaIda.
     * @param fechaRegreso fechaRegreso.
     * @param origen origen.
     * @param destino destino.
     * @return String.
     */
    public String buscarVuelo(final String fechaIda, final String fechaRegreso,
        final String origen, final String destino) {
            String datos = "ida " + fechaIda + " regreso " + fechaRegreso + " origen " + origen + " destino " + destino;
            return datos;
    }
}
