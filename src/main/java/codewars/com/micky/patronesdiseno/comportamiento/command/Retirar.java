package codewars.com.micky.patronesdiseno.comportamiento.command;

/**
 * Class.
 */
public class Retirar implements IOperacion {
    private Cuenta cuenta;
    private double monto;

    /**
     * Constructor.
     */
    public Retirar() {
    }

    /**
    * @param cuenta cuenta.
    * @param monto monto.
    */
    public void setRetirar(final Cuenta cuenta, final double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void executar() {
        this.cuenta.retirar(monto);
    }
}
