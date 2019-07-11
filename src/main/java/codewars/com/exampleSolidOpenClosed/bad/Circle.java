package codewars.com.exampleSolidOpenClosed.bad;


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
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}
