
public class TableClass {

    public static void main(String[] args) {
        int n=4;
        printTable(n);
    }

    public static void printTable(int n) {       
        for (int i = 0; i <= 10; i++) {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }

}
