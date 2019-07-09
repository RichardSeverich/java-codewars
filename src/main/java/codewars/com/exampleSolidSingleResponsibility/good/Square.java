package codewars.com.exampleSolidSingleResponsibility.good;

/**
 * Class.
 */
public class Square {

    private int side;

    /**
     * @param side side.
     */
    public Square(int side) {
        this.side = side;
    }

    /**
     * @return area.
     */
    public double getArea() {
        return Math.pow(side, 2);
    }
}
