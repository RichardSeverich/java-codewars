package codewars.com.micky.patronesdiseno.estructurales.proxy;

/**
 * Interface.
 */
public interface ICuenta {

    /**
     * @param nombreCuenta nombreCuenta.
     * @param montoRetirar montoRetirar.
     * @return Cuenta.
     */
    Cuenta retirarDinero(Cuenta nombreCuenta, double montoRetirar);

    /**
     * @param nombreCuenta nombreCuenta.
     * @param montoDepositar montoDepositar.
     * @return Cuenta.
     */
    Cuenta depositarDinero(Cuenta nombreCuenta, double montoDepositar);

    /**
     * @param nombreCuenta nombreCuenta.
     * @return String.
     */
    String mostrar(Cuenta nombreCuenta);
}
