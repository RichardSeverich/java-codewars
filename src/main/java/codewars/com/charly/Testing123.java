package codewars.com.charly;

import java.util.List;
import java.util.ArrayList;

public class Testing123 {
    public static List<String> number(List<String> lines) {
        List<String> modificado = new ArrayList();
        for (int num = 0;num < lines.size();num++){
            String ind =String.valueOf(num + 1);
            String contenedor = lines.get(num);
            modificado.add(ind + ": " + contenedor);
        }
    return modificado;
    }
}