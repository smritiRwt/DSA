
import java.util.Scanner;

public class StartPatternSix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = s.nextInt();

        printPattern(n);
    }

    public static void printPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < num; k++) {
                if (k == num - 1 || k == 0 || i == num-1 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
