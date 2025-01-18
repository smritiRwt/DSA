
public class NumberTriangle11 {

    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        int col = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= col; j++) {
                if (count == 10) {
                    count = 1;
                }
                System.out.print(count);
                count++;
            }
            System.out.println();
            col = col * 2;
        }
    }
}
