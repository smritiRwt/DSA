public class Reverse {
    public static void main(String[] args) {
        String a="abcd";
        printReverse(a, a.length()-1);
    }

    public static void printReverse(String str,int index){
        if(index==0){
           System.out.println(str.charAt(index));
           return;
        }
        System.out.println(str.charAt(index));
        printReverse(str,index-1);
    }
}
