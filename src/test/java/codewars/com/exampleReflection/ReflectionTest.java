package codewars.com.exampleReflection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Test.
 */
public class ReflectionTest {

    /**
     * Test 1.
     */
   /*@Test
    public void test1() {
        // User 1
        User user = new User();
        user.setId("6265852");
        user.setName("Michael");
        user.setLastName("Millers");
        user.setBirthDate("18/05/1980");
        user.setEmail("Michael.Millers@gmail.com");
        // Instantiate classes
        ReflectionPrintMethods<User> reflectionPrintMethods;
        reflectionPrintMethods = new ReflectionPrintMethods<>(user);
        // Results
        String[] actualResult = reflectionPrintMethods.getMethods();
        String[] expectedResult = new String[]{
                "public java.lang.String codewars.com.exampleReflection.User.getBirthDate()",
                "public java.lang.String codewars.com.exampleReflection.User.getEmail()",
                "public java.lang.String codewars.com.exampleReflection.User.getId()",
                "public java.lang.String codewars.com.exampleReflection.User.getLastName()",
                "public java.lang.String codewars.com.exampleReflection.User.getName()",
                "public void codewars.com.exampleReflection.User.setBirthDate(java.lang.String)",
                "public void codewars.com.exampleReflection.User.setEmail(java.lang.String)",
                "public void codewars.com.exampleReflection.User.setId(java.lang.String)",
                "public void codewars.com.exampleReflection.User.setLastName(java.lang.String)",
                "public void codewars.com.exampleReflection.User.setName(java.lang.String)"
        };
        Assert.assertArrayEquals(expectedResult, actualResult);
    }*/

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        // User 1
        User user1 = new User();
        user1.setId("6265552");
        user1.setName("Mich");
        user1.setLastName("Harris");
        user1.setBirthDate("18/05/1990");
        user1.setEmail("Michael.Harris@gmail.com");

        // User 2
        User user2 = new User();
        user2.setId("8545632");
        user2.setName("Tony");
        user2.setLastName("Stark");
        user2.setBirthDate("18/08/1991");
        user2.setEmail("Tony.Stark@gmail.com");

        // User 3
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
        String[][] expectedResult = reflectionInvokeMethods.getArrayReports();
        String[][] actualResult = {
                {"6265552", "Mich", "Harris", "18/05/1990", "Michael.Harris@gmail.com"},
                {"8545632", "Tony", "Stark", "18/08/1991", "Tony.Stark@gmail.com"},
                {"9863214", "Nicole", "Cruise", "18/08/1996", "Nicole.Cruise@gmail.com"}
        };
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
