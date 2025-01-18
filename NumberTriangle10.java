
public class NumberTriangle10 {

    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            int count = i + 1;
            for (int j = 3; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            for (int j = (2 * i - 1); j >= i; j--) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
