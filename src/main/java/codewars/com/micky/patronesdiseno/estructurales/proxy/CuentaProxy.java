package codewars.com.micky.patronesdiseno.estructurales.proxy;

/**
 * Class.
 */
public class CuentaProxy implements ICuenta {
    private CuentaBanco cuentaReal;

    /**
    * Constructor.
    */
    public CuentaProxy() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cuenta retirarDinero(final Cuenta nombreCuenta, final double montoRetirar) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBanco();
            return cuentaReal.retirarDinero(nombreCuenta, montoRetirar);
        } else {
            return cuentaReal.retirarDinero(nombreCuenta, montoRetirar);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cuenta depositarDinero(final Cuenta nombreCuenta, final double montoRetirar) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBanco();
            return cuentaReal.depositarDinero(nombreCuenta, montoRetirar);
        } else {
            return cuentaReal.depositarDinero(nombreCuenta, montoRetirar);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String mostrar(final Cuenta nombreCuenta) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBanco();
            return cuentaReal.mostrar(nombreCuenta);
        } else {
            return cuentaReal.mostrar(nombreCuenta);
        }
    }
}
