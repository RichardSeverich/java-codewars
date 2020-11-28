package codewars.com.micky.solid.openclosed.bad;

public class Circle{
    private double radio = 0;

    public Circle (int radio){
        this.radio = (double) radio;
    }

    public double getArea(){
        return (radio * radio) * Math.PI;
    }
}
