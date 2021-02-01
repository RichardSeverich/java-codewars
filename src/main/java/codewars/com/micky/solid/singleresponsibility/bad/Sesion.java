package codewars.com.micky.solid.singleresponsibility.bad;

/**
 * Class.
 */
public final class Sesion {
    private static String validateNick = "micky";

    /**
    * Constructor.
    */
    private Sesion() {
    }

    /**
     * @param nick nickname.
     * @param pass password.
     * @return boolean.
     */
    public static boolean getSesion(final String nick, final String pass) {
        return (nick == validateNick && pass == validateNick);
    }
}
