package codewars.com.micky.solid.singleresponsibility.good;

/**
 * Class.
 */
public final class Nickname {
    static String nickname;
    public static String validate = "micky";

    /**
    * Constructor.
    */
    private Nickname() {
    }

    /**
     * @param nick nickname.
     */
    public static void setNickname(final String nick) {
        nickname = nick;
    }

    /**
     * @return boolean.
     */
    public static boolean getNickname() {
        if (nickname.equals(validate)) {
            return true;
        }
        return false;
    }
}
