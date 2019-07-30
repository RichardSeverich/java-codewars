package codewars.com.exampleReflectionDependencyInjection;

/**
 * @param <T> generic.
 */
public class Wrapper<T> {

    private T instance;

    /**
     * @param instance instance.
     */
    public Wrapper(T instance) {
        this.instance = instance;
    }

    /**
     * @return instance.
     */
    public T getInstance() {
        return instance;
    }
}
