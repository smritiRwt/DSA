public class Number16 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >=1; j--) {//1-1=0 //2-1=1 //3-1=2 //4-1=3 //5-1=4
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
