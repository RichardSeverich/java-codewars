package codewars.com.exampleSolidDependencyInversion.good;

/**
 * Class.
 */
public class Developer extends Employee {

    private static final int BONUS_COEFFICIENT = 12;
    private int salaryBonus;

    /**
     * @param id     id.
     * @param name   name.
     * @param salary salary.
     */
    Developer(final String id, final String name, final int salary) {
        super(id, name, salary);
        salaryBonus = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getSalary() {
        this.salaryBonus = super.getSalary() / BONUS_COEFFICIENT;
        return super.getSalary() + this.salaryBonus;
    }

}
