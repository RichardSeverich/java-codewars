package codewars.com.structures.navigationstack;

/**
 * Main.
 */
public final class Main {


    /**
     * Private constructor.
     */
    private Main() {

    }

    /**
     * We create the windows and we do visible this window.
     *
     * @param args args.
     */
    public static void main(final String[] args) {
        NavigateWindows navigateWindows = new NavigateWindows();
        navigateWindows.setVisible(true);
    }
}
