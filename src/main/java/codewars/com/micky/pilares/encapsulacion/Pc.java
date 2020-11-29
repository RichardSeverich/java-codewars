package codewars.com.micky.pilares.encapsulacion;

/**
 * Class.
 */
public class Pc {
    private int alto;
    private int largo;
    private int grosor;
    private String marca;
    private int temp;

    /**
     * Constructor.
     */
    public Pc() {
        alto = 50;
        largo = 70;
        grosor = 20;
        marca = "delux";
        temp = 15;
    }

    /**
     * @param marca marca.
     */
    public void setPc(final String marca) {
        this.marca = marca;
    }

    /**
     * @return Datos.
     */
    public String getDatos() {
        return "la pc tiene un alto de " + alto + " un largo de " + largo + " un grosor de " + grosor + " es de marca"
                + marca + " esta con temperatura " + temp + " grados";
    }
}
