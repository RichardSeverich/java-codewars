package codewars.com.exampleReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @param <T> Generic class.
 */
public class ReflectionPrint<T> {


    private final T genericClass;

    /**
     * @param genericClass genericClass.
     */
    public ReflectionPrint(final T genericClass) {
        this.genericClass = genericClass;
    }

    /**
     * @return array of strings.
     */
    public String[] getMethods() {
        Class myClass = genericClass.getClass();
        Method[] arrayOfMethods;
        arrayOfMethods = myClass.getDeclaredMethods();
        return convertArrayMethodListString(arrayOfMethods);
    }

    /**
     * @return array of strings.
     */
    public String[] getFields() {
        Class myClass = genericClass.getClass();
        Field[] arrayFields = myClass.getDeclaredFields();
        return convertArrayFieldsListString(arrayFields);
    }

    /**
     * @param arrayOfFields arrayOfFields.
     * @return array of string.
     */
    private String[] convertArrayFieldsListString(final Field[] arrayOfFields) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Field anyField : arrayOfFields) {
            arrayList.add(anyField.getName());
        }
        return arrayList.toArray(new String[0]);
    }

    /**
     * @param arrayOfMethods arrayOfMethods.
     * @return arrayListMethod.
     */
    private String[] convertArrayMethodListString(final Method[] arrayOfMethods) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Method anyMethod : arrayOfMethods) {
            arrayList.add(anyMethod.toString());
        }
        Collections.sort(arrayList);
        return arrayList.toArray(new String[0]);
    }
}
