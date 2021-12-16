package name;

public class Name {
    public static void main(String[] args) {
        String name = "Ahmed Attia";
        String mark = " - ";
        String zeile = name + mark + name + mark + name;
        String ausgabe = zeile + "\n" + zeile + "\n" + zeile;
        System.out.println(ausgabe);
    }
}
