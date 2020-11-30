package codewars.com.micky.solid.openclosed.bad;

/**
 * Class.
 */
public class Circle {
    private double radio = 0;

    /**
     * @param radio radio.
     */
    public Circle(final int radio) {
        this.radio = (double) radio;
    }

    /**
     * @return area.
     */
    public double getArea() {
        return (radio * radio) * Math.PI;
    }
}
