
public class PerfectNumber {

    public static void main(String[] args) {
        int num = 6;

        int sum = 0;
        boolean isPerfect;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                isPerfect = false;
            }
        }
        if (sum == num) {
            System.out.println("is perfect");
        } else {
            System.out.println("is not perfect");
        }
    }
}
