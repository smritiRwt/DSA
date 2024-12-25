
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Value:");
        int n = s.nextInt();
        checkPalindrome(n);
    }

    public static void checkPalindrome(int n) {
        int p = n;
        int digitLength = (int) (Math.log10(n) + 1);
        System.out.println(digitLength);
        int reverse = 0;
        for (int i = 0; i < digitLength; i++) {
            reverse = reverse * 10 + (n % 10);
            n = n / 10;
        }
        if (p == reverse) {
            System.out.print("Palindrome " + p);
        } else {
            System.out.print("Not Palindrome " + p);
        }
    }
}
