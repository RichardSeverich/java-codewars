package codewars.com.exampleSolidInterfaceSegregation.good;

import java.util.List;

/**
 * Interface.
 */
public interface IProfessor extends IUser{

    /**
     * @return salary.
     */
    public String getSalary();


    /**
     * @return ListStudents
     */
    public List<String> geListStudents();
}
