
import java.util.Scanner;

public class StartPatternFive {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = s.nextInt();

        printPattern(n);
    }

    public static void printPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < num; k++) {
                if (k == num - 1 || k == 0||i==0||i==num-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
