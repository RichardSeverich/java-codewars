package codewars.com.exampleReflectionObjectToJson;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JsonConverterTest {

    private static final String LINE_SEPARATOR = "line.separator";
    private static final String INDENTATION = "    ";
    private JsonConverter<User> jsonConverter;
    private StringBuilder expectedResult;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        User user = new User();
        user.setId("6265552");
        user.setName("Mich");
        user.setLastName("Harris");
        user.setBirthDate("18/05/1990");
        user.setEmail("Michael.Harris@gmail.com");
        jsonConverter = new JsonConverter(user);
        expectedResult = new StringBuilder();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        expectedResult
                .append("{").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Id\": 6265552,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Name\": Mich,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"LastName\": Harris,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"BirthDate\": 18/05/1990,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Email\": Michael.Harris@gmail.com").append(System.getProperty(LINE_SEPARATOR))
                .append("}");
        Assert.assertEquals(expectedResult.toString(), jsonConverter.getStringInJSonFormat());
    }
}
