
public class StarPattern21 {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int st = 1;
        int sp = n;
        for (int i = 1; i < (n * 2); i++) {
            for (int k = 0; k < sp; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }

            if (i < n) {
                st++;
                sp--;
            } else {
                st--;
                sp++;
            }

            System.out.println();
        }
    }
}
