package codewars.com.kataAjedrez;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test.
 */
public class ChessTest {


    private Chess chess;

    /**
     * Before.
     */
    @Before
    public void setUp() {
        chess = new Chess();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        chess.setTemp("a");
        Assert.assertTrue(chess.isLowercase());
        Assert.assertFalse(chess.isUppercase());
        chess.setTemp("A");
        Assert.assertTrue(chess.isUppercase());
        Assert.assertFalse(chess.isLowercase());
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        List<String> list = new ArrayList<>();
        list.add("a3");
        list.add("e4");
        list.add("h2");
        list.add("g2");
        list = chess.sort(list, 2);
        final String[] expectedResult = {"g2", "h2", "a3", "e4"};
        String[] actualResult = list.toArray(new String[0]);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Test 10.
     */
    @Test
    public void test10() {
        StringBuilder input = new StringBuilder();
        input
                .append("+---+---+---+---+---+---+---+---+").append(System.getProperty("line.separator"))
                .append("|.r.|:::|.b.|:q:|.k.|:::|.n.|:r:|").append(System.getProperty("line.separator"))
                .append("+---+---+---+---+---+---+---+---+").append(System.getProperty("line.separator"))
                .append("|:p:|.p.|:p:|.p.|:p:|.p.|:::|.p.|").append(System.getProperty("line.separator"))
                .append("+---+---+---+---+---+---+---+---+").append(System.getProperty("line.separator"))
                .append("|...|:::|.n.|:::|...|:::|...|:p:|").append(System.getProperty("line.separator"))
                .append("+---+---+---+---+---+---+---+---+").append(System.getProperty("line.separator"))
                .append("|:::|...|:::|...|:::|...|:::|...|").append(System.getProperty("line.separator"))
                .append("+---+---+---+---+---+---+---+---+").append(System.getProperty("line.separator"))
                .append("|...|:::|...|:::|.P.|:::|...|:::|").append(System.getProperty("line.separator"))
                .append("+---+---+---+---+---+---+---+---+").append(System.getProperty("line.separator"))
                .append("|:P:|...|:::|...|:::|...|:::|...|").append(System.getProperty("line.separator"))
                .append("+---+---+---+---+---+---+---+---+").append(System.getProperty("line.separator"))
                .append("|.P.|:::|.P.|:P:|...|:P:|.P.|:P:|").append(System.getProperty("line.separator"))
                .append("+---+---+---+---+---+---+---+---+").append(System.getProperty("line.separator"))
                .append("|:R:|.N.|:B:|.Q.|:K:|.B.|:::|.R.|").append(System.getProperty("line.separator"))
                .append("+---+---+---+---+---+---+---+---+");
        StringBuilder expectedResult = new StringBuilder();
        expectedResult
                .append("White: Ke1,Qd1,Ra1,Rh1,Bc1,Bf1,Nb1,a2,c2,d2,f2,g2,h2,a3,e4")
                .append(System.getProperty("line.separator"))
                .append("Black: Ke8,Qd8,Ra8,Rh8,Bc8,Ng8,Nc6,a7,b7,c7,d7,e7,f7,h7,h6");
        Assert.assertEquals(expectedResult.toString(), chess.getPositions(input.toString()));
    }
}
