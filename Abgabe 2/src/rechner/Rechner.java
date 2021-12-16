package rechner;

public class Rechner {
    public static void main(String[] args) {
        double x = 5.2;
        double y = 4.2;
        double ergebnis = 0;
        String ausgabe = "";
        String rechenVorschrift = "-";
        if (rechenVorschrift.equals("+")) {
            ergebnis = x + y;
            ausgabe = x + " + " + y + " = " + ergebnis;
        } else if (rechenVorschrift.equals("-")) {
            ergebnis = x - y;
            ausgabe = x + " - " + y + " = " + ergebnis;
        } else if (rechenVorschrift.equals("*")) {
            ergebnis = x * y;
            ausgabe = x + " * " + y + " = " + ergebnis;
        } else if (rechenVorschrift.equals("/")) {
            ergebnis = x / y;
            ausgabe = x + " / " + y + " = " + ergebnis;
        } else {
            ergebnis = 0;
            rechenVorschrift = "undefiniert";
        }
        System.out.println(ausgabe);
    }
}
