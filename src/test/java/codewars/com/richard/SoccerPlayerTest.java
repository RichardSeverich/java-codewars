package codewars.com.richard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;
import java.util.HashSet;

/**
 * Test.
 */
public class SoccerPlayerTest {

    /**
     * Before.
     */
    @Before
    public void setUp() {
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        Set<SoccerPlayer> soccerPlayers = new HashSet<>();
        soccerPlayers.add(new SoccerPlayer("Lionel", "Messi"));
        soccerPlayers.add(new SoccerPlayer("Cristiano Ronaldo", "Dos Santos"));
        soccerPlayers.add(new SoccerPlayer("Lionel", "Messi"));
        soccerPlayers.add(new SoccerPlayer("Andrea", "Pirlo"));
        Set<SoccerPlayer> expectedResult = new HashSet<>();
        expectedResult.add(new SoccerPlayer("Lionel", "Messi"));
        expectedResult.add(new SoccerPlayer("Cristiano Ronaldo", "Dos Santos"));
        expectedResult.add(new SoccerPlayer("Andrea", "Pirlo"));
        Assert.assertEquals(expectedResult, soccerPlayers);
    }
}
