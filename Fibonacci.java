
public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        getFibonacciSeries(n);
    }

    public static void getFibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
