
public class Cross {

    public static void main(String[] args) {
        int n = 5;
        int count = n * 2 - 1;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (j == i || j == count - i + 1) {
                    //9-1+1=9 //9-2+1=8 //9-3+1=7 //9-4+1=6//9-4+1=5//9-4+1=4//9-4+1=3//9-4+1=2//9-4+1=1
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
