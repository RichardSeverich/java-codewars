package codewars.com.exampleReflection;

import codewars.com.exampleUtils.MyAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
     * @return array of strings.
     */
    public String[] getFieldsAnnotations() {
        Class myClass = genericClass.getClass();
        Field[] arrayFields = myClass.getDeclaredFields();
        List<String> arrayListString = new ArrayList<>();
        for (Field anyField : arrayFields) {
            anyField.setAccessible(true);
            String fieldName = anyField.getName();
            if (anyField.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation anyMyAnnotation = anyField.getAnnotation(MyAnnotation.class);
                StringBuilder sb = new StringBuilder();
                sb
                        .append("Field name :")
                        .append(fieldName)
                        .append(" - ")
                        .append("@MyAnnotation.name : ")
                        .append(anyMyAnnotation.name())
                        .append(" - ")
                        .append("@MyAnnotation.description : ")
                        .append(anyMyAnnotation.description());
                arrayListString.add(sb.toString());
            }

        }
        return arrayListString.toArray(new String[0]);
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
