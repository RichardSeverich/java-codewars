package codewars.com.micky.solid.openclosed.bad;

public class Square{
    private double lado = 0;

    public Square (int lado){
        this.lado = (double) lado;
    }

    public double getArea(){
        return lado * lado;
    }
}
