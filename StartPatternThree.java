
import java.util.Scanner;

public class StartPatternThree {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row:");
        int n = s.nextInt();

        printPattern(n);
    }

    public static void printPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || i == j || j == num - 1 || j == num - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
