
import java.util.Scanner;

public class EnterReverse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Value:");
        int n = s.nextInt();
        // int n = 5468983;
        printTable(n);
    }

    public static void printTable(int n) {
        // int digitLength = (int) (Math.log10(n) + 1);
        int digitLength = String.valueOf(n).length();
        System.out.println(digitLength);
        int reverse = 0;
        for (int i = 0; i < digitLength; i++) {
            reverse = reverse * 10 + (n % 10);
            n = n / 10;
        }
        System.out.print(reverse);
    }
}
