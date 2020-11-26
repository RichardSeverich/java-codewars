package codewars.com.exampleSolidLiskovSubstitution.good;

/**
 * Class.
 */
public class Square implements IRectangle {

    private int side;

    /**
     * Constructor.
     * @param side side.
     */
    public Square(final int side) {
        this.side = side;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return this.side * this.side;
    }
}
