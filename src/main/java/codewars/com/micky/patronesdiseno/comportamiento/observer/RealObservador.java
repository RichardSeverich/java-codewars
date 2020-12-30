package codewars.com.micky.patronesdiseno.comportamiento.observer;

/**
 * Class.
 */
public class RealObservador extends Observador {
    private int valorCambio = 3;

    /**
     * Constructor.
     */
    public RealObservador() {
    }

    /**
    * @param sujeto sujeto.
    */
    public void setRealObservador(final Sujeto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String actualizar() {
        return "Real: " + sujeto.getMontoCambiar() * valorCambio;
    }
}
