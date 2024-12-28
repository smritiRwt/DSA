
public class PerfectNumberRange {

    public static void main(String[] args) {
        int first = 1;
        int last = 28;
        for (int j = first; j <= last; j++) {
            int sum = 0;
            int num = j;
            boolean isPerfect;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    isPerfect = false;
                }
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
