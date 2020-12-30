package codewars.com.micky.patronesdiseno.estructurales.adapter;

/**
* Class.
*/
public class GuitarraElectroAcustica implements IGuitarra {
    private GuitarraAcustica guitarraElectroAcustica;

    /**
     * Constructor.
     * @param guitarraElectroAcustica guitarraElectroAcustica.
     */
    public GuitarraElectroAcustica(final GuitarraAcustica guitarraElectroAcustica) {
        this.guitarraElectroAcustica = guitarraElectroAcustica;
        this.guitarraElectroAcustica = new GuitarraAcustica();
    }

    /**
     * @return String.
     */
    @Override
    public String encender() {
        return guitarraElectroAcustica.tocando();
    }

    /**
     * @return String.
     */
    @Override
    public String apagar() {
        return guitarraElectroAcustica.dejarDeTocar();
    }
}
