
public class NumberTriangle19 {

    public static void main(String args[]) {
        int n = 24165;
        while (n > 0) {
            System.out.println(n);
            int d = (int) Math.log10(n);
            int pv = (int) Math.pow(10, d);
            int first = n / pv;
            n = n - (first * pv);
        }
    }
}
