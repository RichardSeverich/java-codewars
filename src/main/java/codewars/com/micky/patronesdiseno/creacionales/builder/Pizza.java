package codewars.com.micky.patronesdiseno.creacionales.builder;

/**
 * Class.
 */
public class Pizza {
    protected String salsa;
    protected String masa;
    protected String queso;

    /**
    * @param masa masa.
    * @return Pizza.
    */
    public Pizza setMasa(final String masa) {
        this.masa = masa;
        return this;
    }

    /**
    * @param salsa salsa.
    * @return Pizza.
    */
    public Pizza setSalsa(final String salsa) {
        this.salsa = salsa;
        return this;
    }

    /**
    * @param queso queso.
    * @return Pizza.
    */
    public Pizza setQueso(final String queso) {
        this.queso = queso;
        return this;
    }

    /**
    * @return String.
    */
    public String getDatos() {
        String datos = "masa " + masa + " salsa " + salsa + " queso " + queso;
        return datos;
    }
}
