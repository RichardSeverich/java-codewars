package codewars.com.exampleReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @param <T> Generic class.
 */
public class ReflectionInvokeMethods<T> {

    private String[][] arrayReport;
    private String[] arrayMethodName;
    private List<T> genericList;
    private T currentGenericClass;
    private Method currentMethod;
    private int currentIndex;

    /**
     * @param genericList     genericList.
     * @param arrayMethodName arrayMethodName.
     */
    public ReflectionInvokeMethods(final List<T> genericList, final String[] arrayMethodName) {
        this.genericList = genericList;
        this.arrayMethodName = arrayMethodName.clone();
        this.currentIndex = 0;
    }

    /**
     * @return arrayReport.
     */
    public String[][] getArrayReports() {
        iterateGenericClasses();
        return arrayReport.clone();
    }

    /**
     * iterateGenericClasses.
     */
    private void iterateGenericClasses() {
        arrayReport = new String[genericList.size()][arrayMethodName.length];
        for (T anyGenericClass : genericList) {
            this.currentGenericClass = anyGenericClass;
            this.iterateMethods();
            this.currentIndex++;
        }
    }

    /**
     * iterateMethods.
     */
    private void iterateMethods() {
        Method[] arrayMethods = currentGenericClass.getClass().getMethods();
        for (Method singleMethod : arrayMethods) {
            this.currentMethod = singleMethod;
            this.selectMethod();
        }
    }

    /**
     * @return String.
     */
    private String invokeMethod() {
        String result = "empty";
        try {
            result = (String) currentMethod.invoke(currentGenericClass);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * selectMethod.
     */
    private void selectMethod() {
        for (int index = 0; index < arrayMethodName.length; index++) {
            if (currentMethod.getName().equals(arrayMethodName[index])) {
                arrayReport[this.currentIndex][index] = this.invokeMethod();
                break;
            }
        }
    }
}
