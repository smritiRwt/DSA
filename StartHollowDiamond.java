
public class StartHollowDiamond {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);

    }

    public static void printPattern(int n) {
        int st = 0;
        int sp = n - 1;
        for (int i = 1; i < n * 2; i++) {
            for (int j = 0; j <= sp; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < st * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= sp; j++) {
                System.out.print("*");
            }
            if (i < n) {
                sp--;
                st++;
            } else {
                st--;
                sp++;
            }
            System.out.println();
        }
    }
}
