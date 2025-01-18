
public class HeartPattern {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n / 2; i++) {
            if (i >= 3) {
                for (int j = i; j < n / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
                for (int j = n - i; j >= i; j--) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
