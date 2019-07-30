package codewars.com.exampleReflectionDependencyInjection;

/**
 * @param <T> generic.
 */
public class TypeClass<T> {


    private T type;

    /**
     * @return classDefinition
     */
    @SuppressWarnings("unchecked")
    public Class<T> getClassType() {
        return (Class<T>) this.type.getClass();
    }
}
