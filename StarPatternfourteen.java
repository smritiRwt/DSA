
public class StarPatternfourteen {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = i; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
