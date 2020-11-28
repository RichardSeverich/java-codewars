package codewars.com.micky.solid.isp.good;

public class Impresora implements Imprimir, Engrampar, Copiar, EnviarFax, SubirInternet, 
                                  ImprimirLaser, ImprimirColores, ImprimirNegro {

    public String getImprimir(){
        return "se imprimio";
    }

    public String getEngrampar(){
        return "se engrampo";
    }

    public String getCopiar(){
        return "se copio";
    }

    public String getEnviarFax(){
        return "se envio fax";
    }

    public String getSubirInternet(){
        return "se subio a internet";
    }

    public String getImprimirLaser(){
        return "se imprimio laser";
    }

    public String getImprimirColores(){
        return "se imprimio colores";
    }

    public String getImprimirNegro(){
        return "se imprimio negro";
    }
}
