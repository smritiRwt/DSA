
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no: ");
        int firstNo = sc.nextInt();
        System.out.println("enter 2nd no: ");
        int secondNo = sc.nextInt();
        sumPrimeNumber(firstNo, secondNo);
    }

    public static void sumPrimeNumber(int firstNo, int secondNo) {
        int sum = 0;
        boolean isPrime = true;
        for (int i = 2; i < secondNo; i++) {
            for (int j = 2; j <= i * i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
