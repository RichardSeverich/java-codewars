package codewars.com.micky.solid.singleresponsibility.good;

import java.util.Scanner;

public class Password {
    static String password;
    
    public static void setPassword(String pass){
        password = pass;
    }
    
    public static boolean getPassword(){
        if (password.equals(Nickname.validate)) {
            return true;
        }
        return false;
    }
}
