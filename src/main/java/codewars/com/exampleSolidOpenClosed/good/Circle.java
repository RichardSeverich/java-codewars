package codewars.com.exampleSolidOpenClosed.good;

/**
 * Class.
 */
public class Circle implements Polygon {

    private int radius;

    /**
     * @param radius radius.
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}
