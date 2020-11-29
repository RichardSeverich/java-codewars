package codewars.com.micky.solid.openclosed.bad;

/**
 * Class.
 */
public class Square {
    private double lado = 0;

    /**
     * @param lado lado.
     */
    public Square(final int lado) {
        this.lado = (double) lado;
    }

    /**
     * @return area.
     */
    public double getArea() {
        return lado * lado;
    }
}
