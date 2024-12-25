public class Rotate {
    public static int freq[]=new int[10];
    public static void main(String[] args) {
        int n=3;
        int arr[]={1,2,3,4,5};
        rotateFunc(arr,n);
    }

    public static void rotateFunc(int arr[],int n){
        for(int i=0;i<n;i++){
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
            arr[j]=arr[j-1];
         }
         arr[0]=temp;
     }
     for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
     }
}

public static void rotateFuncRight(int arr[],int n){
    for(int i=0;i<n;i++){
     int temp=arr[arr.length-1];
     for(int j=0;j<arr.length-1;j++){
        arr[j]=arr[j+1];
     }
     arr[arr.length-1]=temp;
 }
 for(int j=0;j<arr.length;j++){
    System.out.println(arr[j]);
 }
}
}
