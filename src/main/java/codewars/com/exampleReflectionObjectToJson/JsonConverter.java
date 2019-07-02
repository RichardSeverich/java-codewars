package codewars.com.exampleReflectionObjectToJson;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


/**
 * @param <T> generic.
 */
public class JsonConverter<T> {

    private static final String GET = "get";
    private static final String LINE_SEPARATOR = "line.separator";
    private T genericObject;
    private Method currentMethod;
    private Field currentField;
    private String currentAttributeName;
    private Object currentResultMethodInvoke;
    private StringBuilder stringJsonFormat;
    private String indentation;

    /**
     * @param someGenericObject someGenericClass.
     */
    JsonConverter(final T someGenericObject) {
        this.genericObject = someGenericObject;
        this.stringJsonFormat = new StringBuilder();
        this.indentation = "    ";
    }

    /**
     * @return StringInJSonFormat.
     */
    public String getStringInJSonFormat() {
        this.stringJsonFormat
                .append("{").append(System.getProperty(LINE_SEPARATOR));
        this.iterateFields();
        this.stringJsonFormat.setLength(this.stringJsonFormat.length() - 3);
        this.stringJsonFormat
                .append(System.getProperty(LINE_SEPARATOR)).append("}");
        return this.stringJsonFormat.toString();
    }

    /**
     * iterateMethods.
     */
    private void iterateFields() {
        Field[] arrayFields = genericObject.getClass().getDeclaredFields();
        for (Field anyField : arrayFields) {
            this.currentField = anyField;
            this.iterateMethods();
        }
    }

    /**
     * iterateMethods.
     */
    private void iterateMethods() {
        Method[] arrayMethods = genericObject.getClass().getMethods();
        for (Method anyMethod : arrayMethods) {
            this.currentMethod = anyMethod;
            if (this.selectMethod()) {
                break;
            }
        }
    }

    /**
     * selectMethod.
     */
    private boolean selectMethod() {
        String currentMethodName = this.currentMethod.getName();
        String currentFieldName = this.currentField.getName().toLowerCase();
        if (currentMethodName.contains(GET) && currentMethodName.toLowerCase().contains(currentFieldName)) {
            this.currentResultMethodInvoke = this.invokeMethod();
            this.currentAttributeName = currentMethodName.replace(GET, "");
            this.builtSetAttribute();
            return true;
        }
        return false;
    }

    /*
    private void selectStrategy() {
        if (this.genericObject.getClass() == this.currentResultMethodInvoke.getClass()) {
            String newIndentation = this.indentation + this.indentation;
            JsonConverter<T> jsonConverter = new JsonConverter(currentResultMethodInvoke, newIndentation);
            currentResultMethodInvoke = jsonConverter.getStringInJSonFormat();
            builtSetAttribute();
        } else {
            builtSetAttribute();
        }
    }*/

    /**
     *
     */
    private void builtSetAttribute() {
        this.stringJsonFormat
                .append(indentation)
                .append("\"")
                .append(this.currentAttributeName)
                .append("\"")
                .append(":")
                .append(" ")
                .append(this.currentResultMethodInvoke)
                .append(",")
                .append(System.getProperty(LINE_SEPARATOR));
    }

    /**
     * @return String.
     */
    private Object invokeMethod() {
        Object result = null;
        try {
            result = currentMethod.invoke(genericObject);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }
}
