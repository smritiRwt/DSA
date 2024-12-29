
import java.util.Scanner;

public class StartPatternTwo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row:");
        int row = s.nextInt();
        System.out.print("Enter cols:");
        int cols = s.nextInt();
        printPattern(row, cols);
    }

    public static void printPattern(int row, int cols) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || j == cols - 1 || i == row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
