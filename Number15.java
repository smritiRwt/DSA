
public class Number15 {

    public static void main(String[] args) {
        int n = 5;
        int count=1;
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <i; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
