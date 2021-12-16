package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 26;
        int limit = 28;
        System.out.println("n = " + n);
        System.out.println("limit = " + limit);
        System.out.println();

        System.out.println("fibonacci(n) = " + fibonacci(n));
        System.out.println("fibonacciAsLoop(n) = " + fibonacciAsLoop(n));
        System.out.println();

        printFibonacciSequence(limit);

    }

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static int fibonacciAsLoop(int n) {
        int a = 1;
        int b = 1;
        int c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static void printFibonacciSequence(int limit) {
        String plot = "Fibonacci-Folge von n=1 bis n=" + limit + "\n";
        for (int i = 1; i <= limit; i++) {
            plot = plot + fibonacci(i);
            if (i != limit) {
                plot = plot + ", ";
            }
        }
        System.out.println(plot);
    }
}
