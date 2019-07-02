package codewars.com.exampleReflectionObjectToJson;

/**
 * Class.
 */
public class Group {

    private String id;

    private String name;

    private String[] members;

    /**
     * Constructor.
     */
    Group() {

    }

    /**
     * @return getId.
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
     * @return getName.
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
     * @return members.
     */
    public String[] getMembers() {
        return members;
    }

    /**
     * @param members members.
     */
    public void setMembers(final String[] members) {
        this.members = members;
    }
}
