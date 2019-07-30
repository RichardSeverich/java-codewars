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
     * Class.
     */
    public static <TInterface, TClass> void setInstance() {
        // Define Creator
        Creator<TClass> creatorTClass = new Creator();
        Creator<TInterface> creatorInterface = new Creator();

        // Get Types
        creatorInterface.getInstance();
        Class<TInterface> classTypeInterface = creatorInterface.getClassType();

        // Get Instance class
        TClass genericInstancedClass = creatorTClass.getInstance();

        // Wrapper Instance
        Wrapper<TClass> wrapper = new Wrapper<>(genericInstancedClass);

        // Stored.
        objectMap.put(classTypeInterface, wrapper);
    }

    /**
     * @param <TInterface> generic.
     * @return generic instanced object.
     */
    public static <TInterface> Object getInstance() {
        Creator<TInterface> creatorInterface = new Creator<>();
        Class<TInterface> classTypeInterface = creatorInterface.getClassType();
        return objectMap.get(classTypeInterface).getInstance();
    }
}
