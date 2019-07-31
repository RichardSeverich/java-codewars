package codewars.com.exampleReflectionDependencyI;

import codewars.com.exampleReflectionDependencyInjection.Wrapper;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Class.
 */
public final class Container {

    private static Map<Type, Wrapper> objectMap = new HashMap<>();

    /**
     * @param genericInterface genericInterface.
     * @param genericClass     genericClass.
     * @param <I>              Interface.
     * @param <T>              Generic Class.
     */
    public static <I, T>
    void setInstance(final I genericInterface, final T genericClass) {
        // Wrapper Instance
        Wrapper<T> wrapper = new Wrapper<>(genericClass);
        // Stored.
        objectMap.put(genericInterface.getClass(), wrapper);
    }

    /**
     * @param tClass genericClass.
     * @param <T>    genericClass.
     */
    public static <T> void setInstance(final T tClass) {
        // Wrapper Instance
        Wrapper<T> wrapper = new Wrapper<>(tClass);
        // Stored.
        objectMap.put(tClass.getClass(), wrapper);
    }

    /**
     * @param generic generic.
     * @param <T>     generic.
     * @return generic.
     */
    public static <T> Object getInstance(final T generic) {
        return objectMap.get(generic.getClass()).getInstance();
    }
}
