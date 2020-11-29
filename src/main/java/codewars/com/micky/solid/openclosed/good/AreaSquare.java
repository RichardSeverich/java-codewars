package codewars.com.micky.solid.openclosed.good;

/**
 * Class.
 */
public class AreaSquare implements Area {

    private double lado = 0;

    /**
     * @param lado lado.
     */
    public AreaSquare(final int lado) {
        this.lado = (double) lado;
    }

    /**
     * @return area.
     */
    public double getArea() {
        return lado * lado;
    }
}
