package saeuegetiere;

public class Schwein extends Saeugetiere {
    public String name;

    public Schwein(String name) {
        super(name);
    }
    @Override
    public double costs(){
        return  8.5 ;
    }


}
