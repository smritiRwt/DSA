public class Negative {
    public static int negativecount=0;
    public static void main(String[] args) {
        int array[]={ 41,2,-3,-8,10};
        countEvenOdd(array);  
    }
    public static void countEvenOdd(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
              negativecount++;
            }
        }
        System.out.println(negativecount);
}
}
