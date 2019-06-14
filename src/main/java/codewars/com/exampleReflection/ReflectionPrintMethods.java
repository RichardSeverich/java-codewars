package codewars.com.exampleReflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @param <T> Generic class.
 */
public class ReflectionPrintMethods<T> {


    private final T genericClass;

    /**
     * @param genericClass genericClass.
     */
    public ReflectionPrintMethods(final T genericClass) {
        this.genericClass = genericClass;
    }

    /**
     * @return array of strings.
     */
    public String[] getMethods() {
        Class myClass = genericClass.getClass();
        Method[] arrayOfMethods;
        arrayOfMethods = myClass.getDeclaredMethods();
        return convertArrayListString(arrayOfMethods);
    }

    /**
     * @param arrayOfMethods arrayOfMethods.
     * @return arrayListMethod.
     */
    private String[] convertArrayListString(final Method[] arrayOfMethods) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Method anyMethod : arrayOfMethods) {
            arrayList.add(anyMethod.toString());
        }
        Collections.sort(arrayList);
        return arrayList.toArray(new String[0]);
    }
}
