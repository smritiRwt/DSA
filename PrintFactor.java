
public class PrintFactor {

    public static void main(String[] args) {
        int num = 10;
        printPrime(num);
    }

    public static void printPrime(int num) {
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            if (num % i == 0) {
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
                    System.out.println(i);
                }
            }

        }
    }
}
