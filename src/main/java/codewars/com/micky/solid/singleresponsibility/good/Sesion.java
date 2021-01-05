package codewars.com.micky.solid.singleresponsibility.good;

/**
 * Class.
 */
public final class Sesion {

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
    public static boolean getResult(final String nick, final String pass) {
        Nickname.setNickname(nick);
        Password.setPassword(pass);
        boolean nickname = Nickname.getNickname();
        boolean password = Password.getPassword();
        return (nickname && password);
    }
}
