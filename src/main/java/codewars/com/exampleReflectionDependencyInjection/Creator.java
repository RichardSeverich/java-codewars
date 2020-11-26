package codewars.com.exampleReflectionDependencyInjection;


/**
 * Class.
 * @param <T> generic.
 */
public class Creator<T> {

    /**
     * Constructor.
     */
    public Creator() {

    }

    /**
     * @param classDefinition classDefinition.
     * @return generic.
     */
    private Object createObject(final Class<T> classDefinition) {
        Object object = null;
        try {
            object = classDefinition.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println(e);
        }
        return object;
    }

    /**
     * @param o     o.
     * @param clazz clazz.
     * @return Generic.
     */
    private T convertInstanceOfObject(final Object o, final Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch (ClassCastException e) {
            return null;
        }
    }

    /**
     * @param classDefinition classDefinition.
     * @return generic.
     */
    public T getInstance(final Class<T> classDefinition) {
        Object object = this.createObject(classDefinition);
        return this.convertInstanceOfObject(object, classDefinition);
    }
}
