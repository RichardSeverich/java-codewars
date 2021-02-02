package codewars.com.micky.solid.singleresponsibility.good;

/**
 * Class.
 */
public final class Password {
    private static String password;

    /**
    * Constructor.
    */
    private Password() {
    }

    /**
     * @param pass password.
     */
    public static void setPassword(final String pass) {
        password = pass;
    }

    /**
     * @return boolean.
     */
    public static boolean getPassword() {
        if (password.equals(Nickname.validate)) {
            return true;
        }
        return false;
    }
}
