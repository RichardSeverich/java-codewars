package codewars.com.micky.patronesdiseno.creacionales.singleton;

/**
 * Class.
 */
public final class Singleton {
    private static Singleton instance;

    /**
     * Constructor.
     */
    private Singleton() {
    }

    /**
     * @return Singleton.
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return null;
    }
}
