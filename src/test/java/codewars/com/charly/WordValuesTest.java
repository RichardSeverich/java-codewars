package codewars.com.charly;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class WordValuesTest{    
    @Test
    public void basicTests(){     
        assertArrayEquals(new int[]{6,24},
        WordValues.nameValue(new String[]{"abc","abc abc"}));
        assertArrayEquals(new int[]{88,12,225},
        WordValues.nameValue(new String[]{"codewars","abc","xyz"}));
        assertArrayEquals(new int[]{351,282,330},
        WordValues.nameValue(new String[]{"abcdefghijklmnopqrstuvwxyz","stamford bridge","haskellers"})); 
    }
}  //https://www.codewars.com/kata/598d91785d4ce3ec4f000018/train/java