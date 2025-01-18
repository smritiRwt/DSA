
public class NumberTriangle14 {

    public static void main(String[] args) {
        int n = 5;
        int gap;
        int value;
        for (int i = 1; i <= n; i++) {
            gap = n - 1;
            value = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(value);
                value = value + gap;
                gap--;
            }
            System.out.println();
        }
    }
}
