package codewars.com.micky.patronesdiseno.estructurales.facade;

/**
 * Class.
 */
public class FacadeVuelo {
    private Vuelo vuelo;

    /**
    * Constructor.
    */
    public FacadeVuelo() {
        vuelo = new Vuelo();
    }

    /**
     * @param fechaIda fechaIda.
     * @param fechaRegreso fechaRegreso.
     * @param origen origen.
     * @param destino destino.
     * @return String.
     */
    public String buscar(final String fechaIda, final String fechaRegreso,
        final String origen, final String destino) {
            String datos = vuelo.buscarVuelo(fechaIda, fechaRegreso, origen, destino);
            return datos;
    }
}
