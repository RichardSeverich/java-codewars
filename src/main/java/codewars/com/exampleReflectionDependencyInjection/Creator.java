package codewars.com.exampleReflectionDependencyInjection;


/**
 * Class.
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
    private Object createObject(Class<T> classDefinition) {
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
    private T convertInstanceOfObject(Object o, Class<T> clazz) {
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
    public T getInstance(Class<T> classDefinition) {
        Object object = this.createObject(classDefinition);
        return this.convertInstanceOfObject(object, classDefinition);
    }
}
