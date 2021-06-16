package codewars.com.richard;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.lang.StringBuilder;
import java.util.ArrayList; 
import java.util.Arrays;

public class CompressString {

    /**
     * Constructor.
     */
    public CompressString() {

    }

    public String compress(String text){
        StringBuilder result = new StringBuilder(); 
        String[] array = text.split("");
        Set<String> set = new HashSet<>(Arrays.asList(array));
        List<String> list = new ArrayList<String>(set);
        for (String item : list) {
            System.out.println(item);
            int counter = 0;
            for(int i=0;i < array.length; i++) {
               if(item.equals(array[i])){
                 counter++;
               }
            }
            if(counter == 1 ){
               result.append(item);
            } else {
              result.append(item);
              result.append(counter);
            }
        }
        return result.toString();
    }

}
