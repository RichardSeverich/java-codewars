package codewars.com.exampleReflectionObjectToJson;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.List;


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
    private JsonConverterUtils utils;

    /**
     * @param someGenericObject someGenericClass.
     */
    JsonConverter(final T someGenericObject) {
        this.genericObject = someGenericObject;
        this.stringJsonFormat = new StringBuilder();
        this.utils = new JsonConverterUtils();
        this.indentation = "    ";
    }

    /**
     * @return StringInJSonFormat.
     */
    public String getStringInJSonFormat() {
        final int three = 3;
        this.stringJsonFormat
                .append("{").append(System.getProperty(LINE_SEPARATOR));
        this.iterateFields();
        this.stringJsonFormat.setLength(this.stringJsonFormat.length() - three);
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
     * @return boolean.
     */
    private boolean selectMethod() {
        String currentMethodName = this.currentMethod.getName();
        String currentFieldName = this.currentField.getName().toLowerCase();
        if (currentMethodName.contains(GET)
                && currentMethodName.replace(GET, "").equalsIgnoreCase(currentFieldName)) {
            this.currentResultMethodInvoke = this.invokeMethod();
            this.currentAttributeName = currentMethodName.replace(GET, "");
            this.selectStrategy();
            return true;
        }
        return false;
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


    /**
     * selectStrategy.
     */
    private void selectStrategy() {
        if (this.utils.isArray(this.currentResultMethodInvoke)) {
            this.builtSetAttributeArray();
        } else if (this.utils.isCollection(this.currentResultMethodInvoke)) {
            List list = (List) this.currentResultMethodInvoke;
            this.currentResultMethodInvoke = list.toArray(new Object[0]);
            this.builtSetAttributeArray();
        } else {
            this.builtSetAttribute();
        }
    }

    /**
     * builtSetAttribute.
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
     * builtSetAttributeArray.
     */
    private void builtSetAttributeArray() {
        this.stringJsonFormat
                .append(indentation)
                .append("\"")
                .append(this.currentAttributeName)
                .append("\"")
                .append(":")
                .append(" ")
                .append("[");
        this.builtIterateArray();
        this.stringJsonFormat.append("]")
                .append(",")
                .append(System.getProperty(LINE_SEPARATOR));
    }

    /**
     * builtIterateArray.
     */
    private void builtIterateArray() {
        Object[] objectArray = (Object[]) this.currentResultMethodInvoke;
        for (Object anyElement : objectArray) {
            this.stringJsonFormat
                    .append(anyElement)
                    .append(",");
        }
        this.stringJsonFormat.setLength(this.stringJsonFormat.length() - 1);
    }
}
