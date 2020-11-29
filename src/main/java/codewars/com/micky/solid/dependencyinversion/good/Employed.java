package codewars.com.micky.solid.dependencyinversion.good;

/**
 * Interface.
 */
public abstract class Employed {

    private String id;
    private String name;

    /**
     * @param id   id.
     * @param name name.
     */
    Employed(final String id, final String name) {
        this.id = id;
        this.name = name;

    }

    /**
     * @return id.
     */
    String getId() {
        return id;
    }

    /**
     * @return name.
     */
    String getName() {
        return name;
    }
}
