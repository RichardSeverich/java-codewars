package codewars.com.exampleSolidOpenClosed.bad;

/**
 * class.
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
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
