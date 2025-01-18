public class NumberTriangle3 {
    public static void main(String[] args) {
        int n=5;
        int old=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(old==1){
                    System.out.print("1");
                    old=0;
                }
                else{
                    System.out.print("0");
                    old=1;
                }
            }
            System.out.println();
        }
    }
}
