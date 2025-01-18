
class NumberPatternArrow2 {

    public static void main(String[] args) {
        int n = 5;
        int count = n * 2 - 1;
        int value = 1;
        for (int i = 1; i <= count; i++) {
            int count1 = (i <= n) ? 2 * i - 1 : 2 * (count - i) + 1;
            for (int j = 1; j <= count1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
