package codewars.com.micky.patronesdiseno.comportamiento.observer;

/**
 * Class.
 */
public class DolarObservador extends Observador {
    private int valorCambio = 7;

    /**
     * Constructor.
     */
    public DolarObservador() {
    }

    /**
    * @param sujeto sujeto.
    */
    public void setDolarObservador(final Sujeto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String actualizar() {
        return "Dolar: " + sujeto.getMontoCambiar() * valorCambio;
    }
}
