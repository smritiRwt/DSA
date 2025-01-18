
public class EightStar {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n * 2; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && j == 1) || (i==1 &&j==n)||(i==2*n-1&&j==1)||(i==2*n-1&&j==n)||(i==n&&j==1)||(i==n&&j==n)) {
                    System.out.print(" ");
                }else
                if (i == 1 || i == n || (j == 1) || j == n || i == n * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
