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
    String getId();

    /**
     *
     * @return name.
     */
    String getName();

    /**
     *
     * @return salary.
     */
    String getSalary();

    /**
     *
     * @return ListProfessors
     */
    List<String> geListProfessors();

    /**
     *
     * @return ListStudents
     */
    List<String> geListStudents();

}
