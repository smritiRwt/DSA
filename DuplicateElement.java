public class DuplicateElement {
    public static void main(String[] args) {
        int array[]={1,10,20,1,25,1,10,30,25,1};
        checkDuplicate(array);  
    }
    public static void checkDuplicate(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                break;
            }
        }
        }
        System.out.println(count);
    }

}
