package codewars.com.micky.patronesdiseno.estructurales.proxy;

/**
 * Class.
 */
public class Cuenta {
    private double saldoInicial;
    private String usuario;

    /**
    * Constructor.
    */
    public Cuenta() {
    }

    /**
     * @param usuario usuario.
     * @param saldoInicial saldoInicial.
     */
    public void setCuenta(final String usuario, final double saldoInicial) {
        this.usuario = usuario;
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return String.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param setSaldo setSaldo.
     */
    public void setSaldoInicial(final double setSaldo) {
        saldoInicial = setSaldo;
    }

    /**
     * @return String.
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }
}
