package codewars.com.exampleSolidSingleResponsibility.bad;

/**
 * Class.
 */
public class Square {

    /**
     * @param base base.
     * @return area.
     */
    public double getAreaSquare(final double base) {
        return base * base;
    }

    /**
     * @param base   base.
     * @param height height.
     * @return area.
     */
    public double getAreaRectangle(final double base, final double height) {
        return base * height;
    }

    /**
     * @param radius radius.
     * @return area.
     */
    public double getAreaCircle(final double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * @param base   base.
     * @param height height.
     * @return area.
     */
    public double getAreaTriangle(final double base, final double height) {
        return (base * height) / 2;
    }

}
