public class SecondLargest {
    public static int largest=10;
    public static int secondLargest=0;
    public static void main(String[] args) {
         int array[]={ 41,2,3,8,1};
         largest=array[1];
         secondLargest=array[0];
         getSecondLargest(array);        
    }
    public static void getSecondLargest(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }else if(secondLargest<arr[i]){
                secondLargest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
}

}
