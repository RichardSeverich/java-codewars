package codewars.com.micky.solid.singleresponsibility.bad;

/**
 * Class.
 */
public class Sesion {
    static String validateNick = "micky";

    /**
     * @param nick nickname.
     * @param pass password.
     * @return boolean.
     */
    public static boolean getSesion(final String nick, final String pass) {
        return (nick == validateNick && pass == validateNick);
    }
}
