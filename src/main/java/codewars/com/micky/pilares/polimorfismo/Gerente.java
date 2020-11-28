package codewars.com.micky.pilares.polimorfismo;

public class Gerente extends Employed {
    private double aumento;
    private double sueldoTotalGerente;
    
    public Gerente(String nom, int ci, String cargo, int id , double sue ) {
        super(nom, ci, cargo, id, sue);
    }

    public void setAumentoGerente(double aumento){
        aumento = this.aumento;
    }

    public double getSueldoTotalGerente() {
        double sueldoGerente = super.getSueldoTotal();
        sueldoTotalGerente = sueldoGerente + aumento;
        return sueldoTotalGerente;
    }
}
