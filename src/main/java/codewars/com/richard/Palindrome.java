package codewars.com.richard;

import java.lang.StringBuilder;

public class Palindrome {

    /** * Constructor. */
    public Palindrome() {

    }

    /** */
    public Boolean isPalindrome(String text){
        return new StringBuilder(text).reverse().toString().equalsIgnoreCase(text);
    }

}
