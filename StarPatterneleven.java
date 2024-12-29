
import java.util.Scanner;

public class StarPatterneleven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = s.nextInt();
        printPattern(n);
    }

    public static void printPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int k = i; k <= num; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
