public class CountEvenOdd {
    public static int even=0;
    public static int odd=0;
    public static void main(String[] args) {
        int array[]={ 41,2,3,8,10};
        countEvenOdd(array);  
    }
    public static void countEvenOdd(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
              even++;
            }else if(arr[i]%2!=0){
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
}
}
