package codewars.com.micky.solid.liskovsubstitution.bad;

/**
 * Class.
 */
public class RubberDuck extends Duck {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFly() {
        return "";
    }
}
