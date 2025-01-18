
public class StarPattern20 {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int c = 0;
        for (int i = 1; i < (n * 2); i++) {
            if (i > n) {
                c--;
            } else {
                c++;
            }
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
