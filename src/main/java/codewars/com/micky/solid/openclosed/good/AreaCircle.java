package codewars.com.micky.solid.openclosed.good;

/**
 * Class.
 */
public class AreaCircle implements Area {

    private double radio = 0;

    /**
     * @param radio radio.
     */
    public AreaCircle(final int radio) {
        this.radio = (double) radio;
    }

    /**
     * @return area.
     */
    public double getArea() {
        return (radio * radio) * Math.PI;
    }
}
