package minimum;

public class Minimum {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int z = -2;
        int min = 0;
        System.out.println("x ist " + x);
        System.out.println("y ist " + y);
        System.out.println("z ist " + z);
        min = (x < y) ? x : y;
        min = (min < z) ? min : z;
        System.out.println("Das Minimum ist " + min);
    }
}
