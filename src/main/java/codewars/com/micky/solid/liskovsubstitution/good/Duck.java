package codewars.com.micky.solid.liskovsubstitution.good;

/**
 * Class.
 */
public class Duck implements Fly, Swing, Cuack {

    /**
     * @return String.
     */
    public String getFly() {
        return "si vuela";
    }

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
