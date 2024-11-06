package recursao;

public class Fibonacci {
    // EXERC 4
    public static int fibonacci(int n) {

        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
