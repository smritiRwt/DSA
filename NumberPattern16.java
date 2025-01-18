
public class NumberPattern16 {

    public static void main(String[] args) {
        int n = 5;
        int value;
        int row = 0;
        for (int i = 1; i <= n; i++) {
            value = (i % 2 != 0) ? row + 1 : row + i;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                if (i % 2 != 0) {
                    value++;
                } else {
                    value--;
                }
                row++;
            }

            System.out.println();
        }
    }
}
