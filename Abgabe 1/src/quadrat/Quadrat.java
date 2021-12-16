package quadrat;

public class Quadrat {
    public static void main(String[] args) {
        double seitenLaenge = 20.0;
        double flaeche = seitenLaenge * seitenLaenge;
        double diagonale = seitenLaenge * Math.sqrt(2);
        System.out.println("Seitenlänge des Quadrats: " + seitenLaenge);
        System.out.println("Fläche des Quadrats: " + flaeche);
        System.out.println("Diagonale des Quadrats: " + diagonale);
    }
}