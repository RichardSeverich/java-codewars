package codewars.com.exampleSolidSingleResponsibility.good;

/**
 * Class.
 */
public class Circle {

    private int radius;

    /**
     * @param radius radius.
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * @return area.
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
