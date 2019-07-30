package codewars.com.exampleReflectionDependencyI;

import java.lang.reflect.ParameterizedType;

/**
 * @param <T> generic.
 */
public class Creator<T> {

    private T type;

    /**
     * Constructor.
     */
    Creator() {

    }

    /**
     * @return classDefinition
     */
    @SuppressWarnings("unchecked")
    public Class<T> getClassType() {
        return (Class<T>) this.type.getClass();
    }

    /**
     * @return
     */
    @SuppressWarnings("unchecked")
    public T getInstance() {
        return type;
    }
}
