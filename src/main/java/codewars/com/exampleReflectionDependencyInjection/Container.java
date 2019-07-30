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
    public static <TInterface, TClass> void setInstance() {
        // Define Creator
        Creator<TClass> creator = new Creator<>();

        // Define Types Class Creator
        TypeClass<TInterface> typeClassInterface = new TypeClass<>();
        TypeClass<TClass> typeClassClass = new TypeClass<>();

        // Get Types
        Class<TInterface> classTypeInterface = typeClassInterface.getClassType();
        Class<TClass> classTypeClass = typeClassClass.getClassType();

        // Get Instance class
        TClass genericInstancedClass = creator.getInstance(classTypeClass);

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
        TypeClass<TInterface> typeClassInterface = new TypeClass<>();
        Class<TInterface> classTypeInterface = typeClassInterface.getClassType();
        return objectMap.get(classTypeInterface).getInstance();
    }
}
