
public class Number5 {

    public static void main(String[] args) {
        int n = 5;
        int cr = n + 1;
        int cc = n + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==(n/2)+1&&j==(n/2)+1) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }
}
