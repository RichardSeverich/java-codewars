package codewars.com.micky.pilares.polimorfismo;

/**
 * Class.
 */
public class Gerente extends Employed {
    private double aumento;
    private double sueldoTotalGerente;

    /**
     * @param nom   nombre.
     * @param ci    carnet.
     * @param cargo cargo.
     * @param id    id.
     * @param sue   sueldo.
     */
    public Gerente(final String nom, final int ci, final String cargo, final int id, final double sue) {
        super(nom, ci, cargo, id, sue);
    }

    /**
     * @param aumento aumento.
     */
    public void setAumentoGerente(final double aumento) {
        this.aumento = aumento;
    }

    /**
     * @return sueldoTotal.
     */
    public double getSueldoTotalGerente() {
        double sueldoGerente = super.getSueldoTotal();
        sueldoTotalGerente = sueldoGerente + aumento;
        return sueldoTotalGerente;
    }
}
