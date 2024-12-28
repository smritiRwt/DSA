
public class StrongNumber {

    public static void main(String[] args) {
        int num = 145;
        checkArmstrong(num);
    }

    public static void checkArmstrong(int num) {
        int n = num;
        int factSum = 0;
        while (num > 0) {
            int rem;
            int fact = 1;
            rem = (num % 10);
            for (int j = 1; j <= rem; j++) {
                fact = fact * j;
            }
            factSum += fact;
            num = num / 10;
        }
        if (n == factSum) {
            System.out.println(factSum + " strong number");
        } else {
            System.out.println(factSum + " Not an strong number");
        }
    }
}
