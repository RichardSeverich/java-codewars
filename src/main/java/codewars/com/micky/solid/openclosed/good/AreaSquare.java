package codewars.com.micky.solid.openclosed.good;

public class AreaSquare implements Area {
    
    private double lado = 0;

    public AreaSquare (int lado){
        this.lado = (double) lado;
    }

    public double getArea(){
        return lado * lado;
    }
}
