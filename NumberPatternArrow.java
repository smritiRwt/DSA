
class NumberPatternArrow {

    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(j);
            }
            System.out.println();
            if (i < n) {
                count++;
            } else {
                count--;
            }
        }
    }

}
