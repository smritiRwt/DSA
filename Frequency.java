public class Frequency {
 public static boolean freq[]=new boolean[5];

    public static void main(String[] args) {
        int array[]={ 41,2,41,8,10};
        checkFreq(array);  
    }
    public static void checkFreq(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(freq[i]==true){
                continue;
            }
        int count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                freq[j]=true;
                 count++;
            }
        }
        System.out.println(arr[i]+ "="+count);
        }
}
}
