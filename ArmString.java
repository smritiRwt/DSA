
public class ArmString {

    public static void main(String[] args) {
        int num = 371;
        checkArmstrong(num);
    }

    public static void checkArmstrong(int num) {
        int count = (int) Math.log10(num) + 1;
        int sum = 0;
        int rem ;
        int n = num;
        while (num > 0) {
            rem = (num % 10);
            sum += Math.pow(rem, count);
            num = num / 10;
        }
        if (n == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }
    }
}
