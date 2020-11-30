package codewars.com.micky.katas;

/**
 * Class.
 */
public class Welcome {

    /**
     * @param language language.
     * @return String.
     */
    public static String greet(final String language) {

        if (language.equals("english")) {
            return "Welcome";
        }
        if (language.equals("czech")) {
            return "Vitejte";
        }
        if (language.equals("danish")) {
            return "Velkomst";
        }
        if (language.equals("dutch")) {
            return "Welkom";
        }
        if (language.equals("estonian")) {
            return "Tere tulemast";
        }
        if (language.equals("finnish")) {
            return "Tervetuloa";
        }
        if (language.equals("flemish")) {
            return "Welgekomen";
        }
        if (language.equals("french")) {
            return "Bienvenue";
        }
        if (language.equals("german")) {
            return "Willkommen";
        }
        if (language.equals("irish")) {
            return "Failte";
        }
        if (language.equals("italian")) {
            return "Benvenuto";
        }
        if (language.equals("latvian")) {
            return "Gaidits";
        }
        if (language.equals("lithuanian")) {
            return "Laukiamas";
        }
        if (language.equals("polish")) {
            return "Witamy";
        }
        if (language.equals("spanish")) {
            return "Bienvenido";
        }
        if (language.equals("swedish")) {
            return "Valkommen";
        }
        if (language.equals("welsh")) {
            return "Croeso";
        }
        return "Welcome";
    }
}