package codewars.com.micky.solid.singleresponsibility.good;

public class Sesion {
    
    public static boolean getResult(String nick, String pass){
        Nickname.setNickname(nick);
        Password.setPassword(pass);
        boolean nickname = Nickname.getNickname();
        boolean password = Password.getPassword();
        return (nickname && password);
    }
}