
public class OddNumberPattern {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int number = (i * 2) - 1;
            for (int j = i; j <= n; j++) {
                System.out.print(number);
                number = number + 2;
            }
            System.out.println();
        }
    }
}
