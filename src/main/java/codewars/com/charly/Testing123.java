package codewars.com.charly;

import java.util.List;
import java.util.ArrayList;

/**
* Class.
*/
public final class Testing123 {

    /**Constructor. */
    private Testing123() { }

    /**
     * @param lines list.
     * @return List.
     */
    public static List<String> number(final List<String> lines) {
        List<String> modificado = new ArrayList();
        for (int num = 0; num < lines.size(); num++) {
            String ind = String.valueOf(num + 1);
            String contenedor = lines.get(num);
            modificado.add(ind + ": " + contenedor);
        }
    return modificado;
    }
}
