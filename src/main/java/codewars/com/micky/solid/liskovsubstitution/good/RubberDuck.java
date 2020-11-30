package codewars.com.micky.solid.liskovsubstitution.good;

/**
 * Class.
 */
public class RubberDuck implements Swing, Cuack {

    /**
     * @return String.
     */
    public String getSwing() {
        return "si nada";
    }

    /**
     * @return String.
     */
    public String getCuack() {
        return "si hace cuack";
    }
}
