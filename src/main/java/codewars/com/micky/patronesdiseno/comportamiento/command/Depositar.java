package codewars.com.micky.patronesdiseno.comportamiento.command;

/**
 * Class.
 */
public class Depositar implements IOperacion {
    private Cuenta cuenta;
    private double monto;

    /**
     * Constructor.
     */
    public Depositar() {
    }

    /**
    * @param cuenta cuenta.
    * @param monto monto.
    */
    public void setDeposito(final Cuenta cuenta, final double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void executar() {
        this.cuenta.depositar(monto);
    }
}
