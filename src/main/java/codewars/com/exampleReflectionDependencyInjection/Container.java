package codewars.com.exampleReflectionDependencyInjection;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Class.
 */
public final class Container {

    private static Map<Type, Wrapper> objectMap = new HashMap<>();

    /**
     * Class.
     */
    public static <T> void set(Class<T> classDefinition) {
        Creator<T> creator;
        creator = new Creator<>();
        T genericClass = creator.getInstance(classDefinition);
        Wrapper<T> wrapper = new Wrapper<>(genericClass);
        objectMap.put(classDefinition, wrapper);
    }

    /**
     * @param classDefinition classDefinition.
     * @param <T>             generic.
     * @return generic instanced object.
     */
    public static <T> Object getInstance(Class<T> classDefinition) {
        return objectMap.get(classDefinition).getInstance();
    }
}
