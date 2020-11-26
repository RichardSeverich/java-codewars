package codewars.com.exampleSolidInterfaceSegregation.good;

import java.util.List;

/**
 * Interface.
 */
public interface IProfessor extends IUser {

    /**
     * @return salary.
     */
    String getSalary();


    /**
     * @return ListStudents
     */
    List<String> geListStudents();
}
