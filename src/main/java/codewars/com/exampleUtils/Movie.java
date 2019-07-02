package codewars.com.exampleUtils;

import java.util.List;

/**
 * Class.
 */
public class Movie {

    private String id;

    private String name;

    private List actors;

    /**
     * Constructor.
     */
    public Movie() {

    }

    /**
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id id.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name name.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return actors.
     */
    public List getActors() {
        return actors;
    }

    /**
     * @param actors actors.
     */
    public void setActors(final List actors) {
        this.actors = actors;
    }
}
