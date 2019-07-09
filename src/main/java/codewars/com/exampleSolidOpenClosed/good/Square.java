package codewars.com.exampleSolidOpenClosed.good;

/**
 * class.
 */
public class Square implements Polygon {

    private int side;

    /**
     * @param side side.
     */
    public Square(int side) {
        this.side = side;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
