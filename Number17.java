
public class Number17 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= (n - i + 1); j++) { //5-1+1=5     //5-2+1=4,3,2,1,
                 
                               System.out.print(j);
            }
            System.out.println();
        }
    }
}
