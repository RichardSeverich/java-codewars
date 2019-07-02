package codewars.com.exampleReflectionObjectToJson;


import codewars.com.exampleUtils.Group;
import codewars.com.exampleUtils.Movie;
import codewars.com.exampleUtils.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test.
 */
public class JsonConverterTest {

    private static final String LINE_SEPARATOR = "line.separator";
    private static final String INDENTATION = "    ";

    private StringBuilder expectedResult;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        expectedResult = new StringBuilder();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        User user = new User();
        user.setId("6265552");
        user.setName("Mich");
        user.setLastName("Harris");
        user.setBirthDate("18/05/1990");
        user.setEmail("Michael.Harris@gmail.com");
        JsonConverter<User> jsonConverter;
        jsonConverter = new JsonConverter<>(user);
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

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        Group group = new Group();
        group.setId("5879654");
        group.setName("Group B");
        group.setMembers(new String[]{"Aly", "Molly", "Angy"});
        JsonConverter<Group> jsonConverter;
        jsonConverter = new JsonConverter<>(group);
        expectedResult
                .append("{").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Id\": 5879654,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Name\": Group B,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Members\": [Aly,Molly,Angy]").append(System.getProperty(LINE_SEPARATOR))
                .append("}");
        Assert.assertEquals(expectedResult.toString(), jsonConverter.getStringInJSonFormat());
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        Group group = new Group();
        group.setId("5879654");
        group.setName("Group B");
        group.setMembers(new String[]{"Aly", "Molly", "Angy"});
        JsonConverter<Group> jsonConverter;
        jsonConverter = new JsonConverter<>(group);
        expectedResult
                .append("{").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Id\": 5879654,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Name\": Group B,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Members\": [Aly,Molly,Angy]").append(System.getProperty(LINE_SEPARATOR))
                .append("}");
        Assert.assertEquals(expectedResult.toString(), jsonConverter.getStringInJSonFormat());
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        final Movie movie = new Movie();
        movie.setId("5214896");
        movie.setName("Dumbo");
        final List<String> actorsList = new ArrayList<>();
        actorsList.add("Lila");
        actorsList.add("Sara");
        actorsList.add("Michael");
        movie.setActors(actorsList);
        JsonConverter<Movie> jsonConverter = new JsonConverter<>(movie);
        expectedResult
                .append("{").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Id\": 5214896,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Name\": Dumbo,").append(System.getProperty(LINE_SEPARATOR))
                .append(INDENTATION).append("\"Actors\": [Lila,Sara,Michael]").append(System.getProperty(LINE_SEPARATOR))
                .append("}");
        Assert.assertEquals(expectedResult.toString(), jsonConverter.getStringInJSonFormat());
    }

}
