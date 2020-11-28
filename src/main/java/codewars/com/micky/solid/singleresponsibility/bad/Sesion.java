package codewars.com.micky.solid.singleresponsibility.bad;

public class Sesion {
    static String validateNick = "micky";

    public static boolean getSesion(String nick, String pass){  
        return (nick == validateNick && pass == validateNick);
    }
}
