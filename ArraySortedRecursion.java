public class ArraySortedRecursion {
    //check if array is strictly increasing/sorted  or not
    //this returns true or false
    public static void main(String[] args) {
        int arr[]={1,2,3,4,59};
        System.out.println(isSorted(arr, 0));
    }

    public  static boolean isSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
        return  isSorted(arr, index+1);
        }else{
            return false;
        }
    }
}
