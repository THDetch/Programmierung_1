package meanvalues;

import java.util.Arrays;

public class MeanValues {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        int c = 8;
        print(a, b, c);
        System.out.println("Mean: " + mean(a, b, c));
        System.out.println("Median: " + median(a, b, c));
        System.out.println("Modal: " + modal(a, b, c));

    }

    static void print(int x, int y, int z) {
        System.out.println("a = " + x);
        System.out.println("b = " + y);
        System.out.println("c = " + z);
    }

    static double mean(int x, int y, int z) {
        double mean = (x + y + z) / 3.0;

        double roundenMean = Math.round(mean * 10) / 10.0;
        return roundenMean;
    }

    static int median(int x, int y, int z) {
        int[] arr = {x, y, z};
        Arrays.sort(arr);
        return arr[1];
    }

    static int modal(int x, int y, int z) {
        if (x == y || x == z) {
            return x;
        } else if (y == x || y == z) {
            return y;
        } else {
            return x;
        }
    }

}
