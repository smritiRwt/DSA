
public class Number14 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >0; i--) {
            for (int j = n; j >0; j--) {
                if (i>j) {
                    System.out.print(i);
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
