package codewars.com.micky.katas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SevenKyuReturnArrayListGoodTest {
  @Test
  public void exampleTests() {
    assertEquals("should return empty for the same content",  list(),         SevenKyuReturnArrayListGood.diff(list('a', 'b'), list('a', 'b')));
    assertEquals("should return A if B is empty",             list('a', 'b'), SevenKyuReturnArrayListGood.diff(list('a', 'b'), list()));
    assertEquals("should return B if A is empty",             list('a', 'b'), SevenKyuReturnArrayListGood.diff(list(), list('a', 'b')));
    assertEquals("should return empty for the empty content", list(),         SevenKyuReturnArrayListGood.diff(list(), list()));
    assertEquals("should return the last character",          list('z'),      SevenKyuReturnArrayListGood.diff(list('a', 'b', 'z'), list('a', 'b')));
    assertEquals("should return the sorted characters",       list('d', 'e', 'j', 'z'),
                                                              SevenKyuReturnArrayListGood.diff(list('a', 'b', 'z', 'd', 'e', 'd'), list('a', 'b', 'j', 'j')));
  }

  public List<Character> list(char... elements) {
    ArrayList<Character> list = new ArrayList<>();
    for (char s : elements) {
      list.add(s);
    }
    return list;
  }
}

