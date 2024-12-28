
public class PrintAllStrongNumber {

    public static void main(String[] args) {
        int last = 1000;
        printAllStringNumber(last);
    }

    public static void printAllStringNumber(int last) {

        for (int i = 1; i <= last; i++) {
            int num = i;
            int n = i;
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
                System.out.println(i);
            }
        }
    }
}
