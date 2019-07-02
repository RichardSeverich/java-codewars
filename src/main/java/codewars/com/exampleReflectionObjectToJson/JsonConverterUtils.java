package codewars.com.exampleReflectionObjectToJson;

import java.util.Collection;
import java.util.Map;

/**
 * Class.
 */
public class JsonConverterUtils {

    /**
     * Constructor.
     */
    JsonConverterUtils() {

    }

    /**
     * @param ob ob.
     * @return return true is is collection.
     */
    public boolean isCollection(final Object ob) {
        return ob instanceof Collection || ob instanceof Map;
    }

    /**
     * @param obj Object.
     * @return true if is array.
     */
    public boolean isArray(final Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    /**
     * @param obj obj.
     * @return true if is primitive array.
     */
    public boolean isPrimitiveArray(final Object obj) {
        return obj != null
                && obj.getClass().isArray()
                && obj.getClass().getComponentType() != null
                && obj.getClass().getComponentType().isPrimitive();
    }
}
