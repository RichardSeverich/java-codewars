package codewars.com.exampleReflection;

/**
 * Class.
 */
public class User {
    private String id;
    private String name;
    private String lastName;
    private String birthDate;
    private String email;

    /**
     * Constructor.
     */
    public User() {

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
     * @return name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName lastName.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return birthDate.
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate setBirthDate.
     */
    public void setBirthDate(final String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email email.
     */
    public void setEmail(final String email) {
        this.email = email;
    }
}
