
public class PrintArmStrong {

    public static void main(String[] args) {
        int last = 1000;
        int first = 1;
        checkArmstrong(first, last);
    }

    public static void checkArmstrong(int first, int last) {

        for (int j = first; j < last; j++) {
            int power = (int) Math.log10(j) + 1;
            int n = j;
            int sum = 0;
            int rem = 0;
            int num = j;
            while (num > 0) {
                rem = (num % 10);
                sum += Math.pow(rem, power);
                num = num / 10;
            }
            if (n == sum) {
                System.out.println(j);
            }
        }

    }
}
