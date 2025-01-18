
public class StarPattern18 {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= (n * 2 - (2 * i - 1)); j++) {
                if (j == 1 || i == 0 || i == n || j == (n * 2 - (2 * i - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
