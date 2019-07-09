package codewars.com.exampleSolidInterfaceSegregation.bad;

import java.util.List;

/**
 * Interface.
 */
public interface User {


    /**
     *
     * @return id.
     */
    public String getId();

    /**
     *
     * @return name.
     */
    public String getName();

    /**
     *
     * @return salary.
     */
    public String getSalary();

    /**
     *
     * @return ListProfessors
     */
    public List<String> geListProfessors();

    /**
     *
     * @return ListStudents
     */
    public List<String> geListStudents();

}
