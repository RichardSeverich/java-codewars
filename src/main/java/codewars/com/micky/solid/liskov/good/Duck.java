package codewars.com.micky.solid.liskov.good;

public class Duck implements Fly, Swing, Cuack{
 
    public String getFly(){
        return "si vuela";
    }

    public String getSwing(){
        return "si nada";
    }

    public String getCuack(){
        return "si hace cuack";
    }
}
