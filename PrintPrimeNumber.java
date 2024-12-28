
public class PrintPrimeNumber {

    public static void main(String[] args) {
        int first = 1;
        int last = 15;
        printPrime(first, last);
    }

    public static void printPrime(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i == 2) {
                    break;
                }
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum: " + sum);
    }
}
