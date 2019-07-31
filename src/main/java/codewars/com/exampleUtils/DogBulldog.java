package codewars.com.exampleUtils;

/**
 * Class.
 */
public class DogBulldog implements IDog {


    private String name;

    /**
     * Constructor.
     */
    public DogBulldog() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return this.name;
    }
}
