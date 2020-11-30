package codewars.com.micky.solid.dependencyinversion.bad;

/**
 * Class.
 */
public class Seller {
    private int id;
    private String name;

    /**
     * @param id   id.
     * @param name name.
     */
    public Seller(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return id.
     */
    public int getId() {
        return id;
    }

    /**
     * @return name.
     */
    public String getName() {
        return name;
    }

}
