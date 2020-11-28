package codewars.com.micky.pilares.herencia;

public class Employed extends Person{
    private String nombre;
    private int carnet;
    private String cargo;
    private int id;
    private double sueldo;
    private double comision;
    private double sueldoTotal;

    public Employed(String nom, int ci, String cargo, int id , double sue) {
        this.nombre = nom;
        this.carnet = ci;
        this.cargo = cargo;
        this.id = id;
        this.sueldo = sue;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setComision(double com) {
        this.comision = com;
    }

    public double getSueldoTotal() {
        sueldoTotal = sueldo + comision;
        return sueldoTotal;
    }

    public String getDatos() {
        return "El cargo del empleado es " + cargo + "\nNombre " + nombre + "\n Num Carnet " + carnet + "\nId " + id + 
               "\nTiene un sueldo total de " + sueldoTotal;
    }
}
