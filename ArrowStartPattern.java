
public class ArrowStartPattern {

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int star = n;
        int space = 1;
        
        for (int i = 1; i < n*2; i++) {
            for (int j = 1; j <space ; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            if(i<n){
                space++;
                star--;
            }else{
                star++;
                space--;
            }
            System.out.println();
        }
      

    }

}
