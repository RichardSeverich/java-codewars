package codewars.com.micky.solid.singleresponsibility.good;

public class Nickname {
    static String nickname;
    public static String validate = "micky";

    public static void setNickname(String nick){
        nickname = nick;
    }

    public static boolean getNickname(){
        if (nickname.equals(validate)) {
            return true;
        }
        return false;
    }
}
