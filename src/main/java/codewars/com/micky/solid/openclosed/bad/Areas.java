package codewars.com.micky.solid.openclosed.bad;

/**
 * Class.
 */
public class Areas {

    /**
     * @param square square.
     * @return area.
     */
    public double getAreaSquare(final Square square) {
        return square.getArea();
    }

    /**
     * @param circle circle.
     * @return area.
     */
    public double getAreaCircle(final Circle circle) {
        return circle.getArea();
    }
}
