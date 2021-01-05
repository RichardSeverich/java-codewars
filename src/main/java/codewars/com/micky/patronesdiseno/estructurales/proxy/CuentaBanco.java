package codewars.com.micky.patronesdiseno.estructurales.proxy;

/**
 * Class.
 */
public class CuentaBanco implements ICuenta {

    /**
    * Constructor.
    */
    public CuentaBanco() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cuenta retirarDinero(final Cuenta nombreCuenta, final double montoRetirar) {
        double saldoActual = nombreCuenta.getSaldoInicial() - montoRetirar;
        nombreCuenta.setSaldoInicial(saldoActual);
        return nombreCuenta;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cuenta depositarDinero(final Cuenta nombreCuenta, final double montoDepositar) {
        double saldoActual = nombreCuenta.getSaldoInicial() + montoDepositar;
        nombreCuenta.setSaldoInicial(saldoActual);
        return nombreCuenta;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String mostrar(final Cuenta nombreCuenta) {
        String cuenta = "cuenta " + nombreCuenta.getUsuario() + " saldo " + nombreCuenta.getSaldoInicial();
        return cuenta;
    }
}
