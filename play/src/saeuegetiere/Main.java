package saeuegetiere;

public class Main {
    public static void main(String[] args) {

        Schwein schwein = new Schwein("Furt");
        Zebra zebra = new Zebra("Woman");

        System.out.println(zebra.name + " " + schwein.name);
        Saeugetiere[] saeugetieres = new Saeugetiere[2];
        saeugetieres[0] = schwein;
        saeugetieres[1] = zebra;

        for (Saeugetiere saeugetiere : saeugetieres) {
            System.out.println(saeugetiere.costs());
        }
    }
}
