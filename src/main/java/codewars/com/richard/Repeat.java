package codewars.com.richard;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList; 
import java.util.Arrays;

/*duplicates on an array.
input ["1", "2", "3", "2", "1"]
output ["1", "2"]*/

public class Repeat {

    /**
     * Constructor.
     */
    public Repeat() {

    }

    public String[] getResult(final String[] array){
       Set<String> set = new HashSet<>(Arrays.asList(array));
       List<String> listNoRepeat = new ArrayList<>(set);
       List<String> result = new ArrayList<>();
       for (String item : listNoRepeat) {
           int counter = 0;
           for(int i=0; i<array.length; i++){
              if(item.equals(array[i])) {
                 counter++;
              }
              if(counter > 1){
                 result.add(item);
                 break;
              }
           }
       }
       String[] arrayResult = new String[result.size()];
       arrayResult = result.toArray(arrayResult);
       return arrayResult;
    }

}
