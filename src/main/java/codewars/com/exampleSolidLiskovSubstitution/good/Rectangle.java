package codewars.com.exampleSolidLiskovSubstitution.good;

/**
 * Class.
 */
public class Rectangle implements IRectangle {

    private int width;
    private int height;

    /**
     * @param width  width.
     * @param height height.
     */
    public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return this.width * this.height;
    }
}
