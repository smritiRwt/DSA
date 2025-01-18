
public class NumberTriangle8 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int count = 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count += 2;
            }
            count = count - 2;
            for (int j = 1; j < i; j++) {
                count = count - 2;
                System.out.print(count);

            }
            System.out.println();
        }
    }
}
