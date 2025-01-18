public class PrintStringFromNumber {
    public static void printString(int n) {

        int num = 0;
        String[] newarray2 = new String[]{"Zero", "One", "two", "three", "four", "five", "six", "Seven", "eight", "nine"};

        while (n != 0) {
            int rem = n % 10;
            num = num * 10 + rem;
            n = n / 10;
        }

        while (num != 0) {
            // for (int i = 0; i < digitLength; i++) {
            int rem = num % 10;
            System.out.print(newarray2[rem]+" ");
            // n = n * 10 + ;  
            // switch (rem) {
            //     case 4:
            //         newarray1[elementcount] = "Four";
            //         break;
            //     case 3:
            //         newarray1[elementcount] = "Three";
            //         break;
            //     case 2:
            //         newarray1[elementcount] = "Two";
            //         break;
            //     case 1:
            //         newarray1[elementcount] = "One";
            //         break;
            //     default:
            //         break;
            // }
            // elementcount++;
            // System.out.println(counter);
            num = num / 10;
        }
        // for (int i = 0; i < newarray1.length; i++) {
        //     System.out.println(newarray1[i]);
        // }
    }

    public static void main(String[] args) {
        int n = 1234;
        printString(n);
    }

}
