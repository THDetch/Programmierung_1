package maximum;

public class Maximum {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int z = -20;
        int max = 0;
        int counter = 0;
        System.out.println("x ist " + x);
        System.out.println("y ist " + y);
        System.out.println("z ist " + z);

        if (x >= y && x >= z) {
            max = x;
        } else if (y >= x && y >= z) {
            max = y;
        } else {
            max = z;
        }
        System.out.println("(1) Das Maximum ist " + max);
        if (x < 0) {
            counter++;
        }
        if (y < 0) {
            counter++;
        }
        if (z < 0) {
            counter++;
        }
        System.out.println("(2) Die Anzahl der negativen Zahlen ist " + counter);
    }

}
