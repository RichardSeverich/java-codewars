package codewars.com.exampleUtils;

//import javax.annotation.Resource;

/**
 * IUser.
 */
public class UserAnnotations {

    @MyAnnotation(name = "ci", description = "cedula del usuario")
    private String id;
    @MyAnnotation(name = "nombre", description = "nombre del ususario")
    private String name;
    @MyAnnotation(name = "fechaNacimiento", description = "fecha de nacimiento")
    private String birthDate;

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
     * @return birthDate.
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate birthDate.
     */
    public void setBirthDate(final String birthDate) {
        this.birthDate = birthDate;
    }
}
