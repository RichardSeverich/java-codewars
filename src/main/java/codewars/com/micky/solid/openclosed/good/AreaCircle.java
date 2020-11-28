package codewars.com.micky.solid.openclosed.good;

public class AreaCircle implements Area{

    private double radio = 0;

    public AreaCircle (int radio){
        this.radio = (double) radio;
    }

    public double getArea(){
        return (radio * radio) * Math.PI;
    }
}
