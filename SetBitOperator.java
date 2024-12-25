public class SetBitOperator {
    public static void main(String [] args){
        int n=5;
        int pos=1;
        int bitmask=n>>pos;
        int newnumber=bitmask|n;
            System.out.println(newnumber);
    }
}
