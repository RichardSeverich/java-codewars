package codewars.com.exampleReflectionObjectToJson;

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
    Movie() {

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
    public void setId(String id) {
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
    public void setName(String name) {
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
    public void setActors(List actors) {
        this.actors = actors;
    }
}
