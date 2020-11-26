package codewars.com.exampleReflection;

import codewars.com.exampleUtils.User;
import codewars.com.exampleUtils.UserAnnotations;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Test.
 */
public class ReflectionTest {

    /**
     * Test 1: Methods.
     */
    @Test
    public void test1() {
        // IUser 1
        User user = new User();
        user.setId("6265852");
        user.setName("Michael");
        user.setLastName("Millers");
        user.setBirthDate("18/05/1980");
        user.setEmail("Michael.Millers@gmail.com");
        // Instantiate classes
        ReflectionPrint<User> reflectionPrintMethods;
        reflectionPrintMethods = new ReflectionPrint<>(user);
        // Results
        String[] actualResult = reflectionPrintMethods.getMethods();
        System.out.println(actualResult.length);
        for (int i = 0; i < actualResult.length; i++) {
            System.out.println(actualResult[i]);
        }
        //This works with Intellij idea
        /*
        String[] expectedResultWindows = new String[]{
                "public java.lang.String codewars.com.exampleUtils.User.getBirthDate()",
                "public java.lang.String codewars.com.exampleUtils.User.getEmail()",
                "public java.lang.String codewars.com.exampleUtils.User.getId()",
                "public java.lang.String codewars.com.exampleUtils.User.getLastName()",
                "public java.lang.String codewars.com.exampleUtils.User.getName()",
                "public void codewars.com.exampleUtils.User.setBirthDate(java.lang.String)",
                "public void codewars.com.exampleUtils.User.setEmail(java.lang.String)",
                "public void codewars.com.exampleUtils.User.setId(java.lang.String)",
                "public void codewars.com.exampleUtils.User.setLastName(java.lang.String)",
                "public void codewars.com.exampleUtils.User.setName(java.lang.String)"
        };
        */
        // This works with gradle
        String[] expectedResult = new String[]{
                "private static boolean[] codewars.com.exampleUtils.User.$jacocoInit()",
                "public java.lang.String codewars.com.exampleUtils.User.getBirthDate()",
                "public java.lang.String codewars.com.exampleUtils.User.getEmail()",
                "public java.lang.String codewars.com.exampleUtils.User.getId()",
                "public java.lang.String codewars.com.exampleUtils.User.getLastName()",
                "public java.lang.String codewars.com.exampleUtils.User.getName()",
                "public void codewars.com.exampleUtils.User.setBirthDate(java.lang.String)",
                "public void codewars.com.exampleUtils.User.setEmail(java.lang.String)",
                "public void codewars.com.exampleUtils.User.setId(java.lang.String)",
                "public void codewars.com.exampleUtils.User.setLastName(java.lang.String)",
                "public void codewars.com.exampleUtils.User.setName(java.lang.String)",
        };
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        // IUser 1
        User user1 = new User();
        user1.setId("6265552");
        user1.setName("Mich");
        user1.setLastName("Harris");
        user1.setBirthDate("18/05/1990");
        user1.setEmail("Michael.Harris@gmail.com");

        // IUser 2
        User user2 = new User();
        user2.setId("8545632");
        user2.setName("Tony");
        user2.setLastName("Stark");
        user2.setBirthDate("18/08/1991");
        user2.setEmail("Tony.Stark@gmail.com");

        // IUser 3
        User user3 = new User();
        user3.setId("9863214");
        user3.setName("Nicole");
        user3.setLastName("Cruise");
        user3.setBirthDate("18/08/1996");
        user3.setEmail("Nicole.Cruise@gmail.com");

        // Add users to list
        List<User> arrayListUser = new ArrayList<>();
        arrayListUser.add(user1);
        arrayListUser.add(user2);
        arrayListUser.add(user3);

        // Instantiate array with methods names.
        String[] arrayMethodName = {"getId", "getName", "getLastName", "getBirthDate", "getEmail"};

        // Instantiate reflection class
        ReflectionInvokeMethods<User> reflectionInvokeMethods;
        reflectionInvokeMethods = new ReflectionInvokeMethods<>(arrayListUser, arrayMethodName);

        // Results
        String[][] actualResult = reflectionInvokeMethods.getArrayReports();
        String[][] expectedResult = {
                {"6265552", "Mich", "Harris", "18/05/1990", "Michael.Harris@gmail.com"},
                {"8545632", "Tony", "Stark", "18/08/1991", "Tony.Stark@gmail.com"},
                {"9863214", "Nicole", "Cruise", "18/08/1996", "Nicole.Cruise@gmail.com"}
        };
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test3: Fields.
     */
    @Test
    public void test3() {
        // IUser 1
        User user = new User();
        user.setId("6265852");
        user.setName("Michael");
        user.setLastName("Millers");
        user.setBirthDate("18/05/1980");
        user.setEmail("Michael.Millers@gmail.com");
        // Instantiate classes
        ReflectionPrint<User> reflectionPrint;
        reflectionPrint = new ReflectionPrint<>(user);
        // Results
        String[] actualResult = reflectionPrint.getFields();
        //This works with Intellij idea
        /*
        String[] expectedResult = new String[]{
                "id",
                "name",
                "lastName",
                "birthDate",
                "email",
        };
        */
        //This works with gradle
        String[] expectedResult = new String[]{
                "id",
                "name",
                "lastName",
                "birthDate",
                "email",
                "$jacocoData"
        };
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test4: Annotations.
     */
    @Test
    public void test4() {
        // IUser 1
        UserAnnotations user = new UserAnnotations();
        user.setId("6265852");
        user.setName("Michael");
        user.setBirthDate("18/05/1980");
        // Instantiate classes
        ReflectionPrint<UserAnnotations> reflectionPrint;
        reflectionPrint = new ReflectionPrint<>(user);
        // Results
        String[] actualResult = reflectionPrint.getFieldsAnnotations();
        String[] expectedResult = new String[]{
                "Field name :id - @MyAnnotation.name : ci - @MyAnnotation.description : cedula del usuario",
                "Field name :name - @MyAnnotation.name : nombre - @MyAnnotation.description : nombre del ususario",
                "Field name :birthDate - @MyAnnotation.name : fechaNacimiento - @MyAnnotation.description : "
                + "fecha de nacimiento",
        };
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
