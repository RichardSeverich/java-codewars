package codewars.com.micky.pilares.herencia;

/**
 * Class.
 */
public class Employed extends Person {
    private String nombre;
    private int carnet;
    private String cargo;
    private int id;
    private double sueldo;
    private double comision;
    private double sueldoTotal;

    /**
     * @param nom   nombre.
     * @param ci    carnet.
     * @param cargo cargo.
     * @param id    id.
     * @param sue   sueldo.
     */
    public Employed(final String nom, final int ci, final String cargo, final int id, final double sue) {
        this.nombre = nom;
        this.carnet = ci;
        this.cargo = cargo;
        this.id = id;
        this.sueldo = sue;
    }

    /**
     * @param cargo cargo.
     */
    public void setCargo(final String cargo) {
        this.cargo = cargo;
    }

    /**
     * @param com comision.
     */
    public void setComision(final double com) {
        this.comision = com;
    }

    /**
     * @return sueldoTotal.
     */
    public double getSueldoTotal() {
        sueldoTotal = sueldo + comision;
        return sueldoTotal;
    }

    /**
     * @return Datos.
     */
    public String getDatos() {
        return "El cargo del empleado es " + cargo + "\nNombre " + nombre + "\n Num Carnet " + carnet + "\nId " + id
                + "\nTiene un sueldo total de " + sueldoTotal;
    }
}
