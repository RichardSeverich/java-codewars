package codewars.com.exampleSolidLiskovSubstitution.bad;

/**
 * Class.
 */
public class Rectangle {

    private int width;
    private int height;

    /**
     * @param width  width.
     * @param height height.
     */
    Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @return area.
     */
    public int getArea() {
        return this.width * this.height;
    }
}
