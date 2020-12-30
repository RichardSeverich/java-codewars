package codewars.com.micky.patronesdiseno.comportamiento.command;

/**
 * Class.
 */
public class Cuenta {
    protected double saldo;

    /**
     * Constructor.
     */
    public Cuenta() {
    }

    /**
    * @param saldo saldo.
    */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
    * @param monto monto.
    * @return String.
    */
    public String depositar(double monto) {
        saldo = saldo + monto;
        return "saldo " + saldo;
    }

    /**
    * @param monto monto.
    * @return String.
    */
    public String retirar(double monto) {
        saldo = saldo - monto;
        return "saldo " + saldo;
    }
}
