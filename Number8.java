
public class Number8 {

    public static void main(String[] args) {
        int n = 5;
        boolean isEven=false;
        for (int i = 1; i <= n; i++) {
            isEven = i % 2 == 0?true:false;
            for (int j = 1; j <= n; j++) {
                if(isEven){
                    if (j%2==0 &&isEven) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }else{
                    if (j%2==0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
               
            }
            System.out.println();
        }
    }
}
