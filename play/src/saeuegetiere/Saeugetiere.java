package saeuegetiere;

public class Saeugetiere {
    public String name = "Oberklasse";

    public Saeugetiere(String name) {
        this.name = name;
    }


    public double costs (){
        return 12.9 ;
    }
    public void print() {
        System.out.println(name);
    }
}
