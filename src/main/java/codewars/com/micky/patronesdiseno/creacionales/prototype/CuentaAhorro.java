package codewars.com.micky.patronesdiseno.creacionales.prototype;

/**
 * Class.
 */
public class CuentaAhorro implements ICuenta {
    private String tipo;
    private double monto;

    /**
     * Constructor.
     */
    public CuentaAhorro() {
        tipo = "ahorro";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ICuenta clonar() {
        CuentaAhorro cuenta = null;
        try {
            cuenta = (CuentaAhorro) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cuenta;
    }

    /**
     * @param monto monto.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * @return String.
     */
    public String getDatos() {
        return "cuenta de tipo " + tipo + " monto " + monto;
    }
}
