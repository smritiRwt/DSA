public class Recursion {
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=calCPower(x,n);
        System.out.println(ans);
    }

    public static int calCPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 1;
        }

        if(n%2==0){
            return calCPower(x, n/2)*calCPower(x, n/2);
        }
        else{

            return calCPower(x, n/2)*calCPower(x, n/2)*x;
        }
    }
}
