package codewars.com.exampleReflectionDependencyInjection;

/**
 * @param <T> generic.
 */
public class Wrapper<T> {

    private T instance;

    /**
     * @param instance instance.
     */
    Wrapper(T instance) {
        this.instance = instance;
    }

    /**
     * @return instance.
     */
    T getInstance() {
        return instance;
    }
}
