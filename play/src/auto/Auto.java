package auto;

public class Auto {
    public String marke;
    public double verbrauch ;
    public  int year ;

    public Auto(String marke, int year) {
        this.year = year ;
        this.marke = marke;
        this.verbrauch = 0.082 ;
    }
    @Override
    public String toString(){
        return marke + ", " + year ;
    }
}
