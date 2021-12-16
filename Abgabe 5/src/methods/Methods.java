package methods;

public class Methods {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;

        boolean resultEven = even(a);
        double resultPythagoras = pythagoras(a, b);
        int resultMinimum = minimum(a, b, c);
        printInfo();
        printVariable("a", a);
        printVariable("b", b);
        printVariable("c", c);
        printBoolean("even(a)", resultEven);
        printDouble("pythagoras(a, b)", resultPythagoras);
        printInt("minimum(a, b, c)", resultMinimum);
        printInfo();
    }

    static boolean even(int x) {
        boolean isEven = (x % 2) == 0;
        return isEven;
    }

    static double pythagoras(int x, int y) {
        double hypotenuse = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
        double roundedHypotenuse = Math.round(hypotenuse * 100) / 100.0;
        return roundedHypotenuse;
    }

    static int minimum(int x, int y, int z) {
        return Math.min((Math.min(x, y)), z);
    }

    static void printInfo() {
        System.out.println("--- Abgabe 5 ---");
    }

    static void printVariable(String initialization, int x) {
        System.out.println("Initialisierung: " + initialization + " = " + x);
    }

    static void printBoolean(String task, boolean result) {
        System.out.println("Die Aussage " + task + " ist " + result);
    }

    static void printDouble(String task, double result) {
        System.out.println(task + " = " + result + " (gerundet)");
    }

    static void printInt(String task, int result) {
        System.out.println(task + " = " + result);
    }

}
