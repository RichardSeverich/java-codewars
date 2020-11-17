package codewars.com.kataCountVowels;

import java.lang.StringBuilder; 
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/*
Ej: eucalipto
Result:
consonants=4
vowels=5
a=1
e=1
i=1
o=1
u=1
*/


/**
* Class.
*/
public class KataCountVowels {

    /**
    * Constructor.
    */
    public KataCountVowels(){
    }

    /**
    * @param text text.
    * @return String solution.
    */
    public String solution(final String text) {
        String lowerCaseText = text.toLowerCase();
        String[] array = lowerCaseText.split("");
        List<String> arrayList = Arrays.asList(array);
        Set<String> hashSet = new HashSet<>();
        int countWowels = 0;
        int countConsonants = 0;
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        for(String value: arrayList){
            switch(value) {
                case "a":
                    countA++;
                    if(hashSet.add(value)){
                        countWowels++;
                    }
                    break;
                case "e":
                    countE++;
                    if(hashSet.add(value)){
                        countWowels++;
                    }
                    break;
                case "i":
                    countI++;
                    if(hashSet.add(value)){
                        countWowels++;
                    }
                    break;
                case "o":
                    countO++;
                    if(hashSet.add(value)){
                        countWowels++;
                    }
                    break;
                case "u":
                    countU++;
                    if(hashSet.add(value)){
                        countWowels++;
                    }
                    break;
                default:
                    if(hashSet.add(value)){
                      countConsonants++;
                    }
            }
        }
        StringBuilder result = new StringBuilder();
        result.append("consonants=" + countConsonants);
        result.append(" ");
        result.append("vowels=" + countWowels);
        result.append(" ");
        result.append("a=" + countA);
        result.append(" ");
        result.append("e=" + countE);
        result.append(" ");
        result.append("i=" + countI);
        result.append(" ");
        result.append("o=" + countO);
        result.append(" ");
        result.append("u=" + countU);
        return result.toString();
    }

}

